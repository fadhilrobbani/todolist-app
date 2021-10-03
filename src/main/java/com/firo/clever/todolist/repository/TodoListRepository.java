package com.firo.clever.todolist.repository;

import com.firo.clever.todolist.entity.TodoList;

import java.util.List;

public interface TodoListRepository {

    void insertInto(TodoList todoList);
    void deleteFrom(Integer id);
    void updateWhere(TodoList todoList,Integer id);
    TodoList selectById(Integer id);
    void selectAll();
}
