package com.firo.clever.todolist.service;

import com.firo.clever.todolist.entity.TodoList;
import com.firo.clever.todolist.repository.TodoListRepository;
import com.firo.clever.todolist.repository.TodoListRepositoryImpl;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoListRepository = new TodoListRepositoryImpl();

    @Override
    public void insert(TodoList todoList) {
        todoListRepository.insertInto(todoList);
    }

    @Override
    public void delete(Integer id) {
        todoListRepository.deleteFrom(id);
    }

    @Override
    public void update(TodoList todoList,Integer id) {
        todoListRepository.updateWhere(todoList,id);
    }

    @Override
    public void findById(Integer id){
       var result = todoListRepository.selectById(id);
       try{
           System.out.println("Todo -> id: "+result.getId()+" | todo: "+result.getTodo());

       }catch (NullPointerException e){
           System.out.println("todo id: "+id+" tidak tersedia");
       }
    }

    @Override
    public void findAll() {
       var todolist =  todoListRepository.selectAll();
       todolist.forEach(System.out::println);
    }
}
