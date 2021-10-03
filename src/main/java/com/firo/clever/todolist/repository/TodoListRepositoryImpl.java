package com.firo.clever.todolist.repository;

import com.firo.clever.todolist.entity.TodoList;
import com.firo.clever.todolist.util.ConnectionUtil;

import java.sql.*;

public class TodoListRepositoryImpl implements TodoListRepository {


    @Override
    public void insertInto(TodoList todoList) {
        try(Connection connection = ConnectionUtil.getDataSource().getConnection()){
            String sql ="insert into tbl_todolist(todo) values(?);";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

                preparedStatement.setString(1,todoList.getTodo());
                preparedStatement.executeUpdate();

                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){

                    if(resultSet.next()){
                        Integer resultId = resultSet.getInt(1);
                        todoList.setId(resultId);
                        System.out.println("Todo berhasil ditambahkan dengan id: "+resultId);
                    }

                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }catch (SQLException e){
                throw new RuntimeException(e);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteFrom(Integer id) {
        try(Connection connection = ConnectionUtil.getDataSource().getConnection()){
            String sql = "delete from tbl_todolist where id=?;";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){

                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
                System.out.println("Todo dengan id "+id+" berhasil dihapus!");

            }catch (SQLException e){
                throw new RuntimeException(e);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateWhere(Integer id) {

    }

    @Override
    public void selectById(Integer id) {

    }

    @Override
    public void selectAll() {

    }
}
