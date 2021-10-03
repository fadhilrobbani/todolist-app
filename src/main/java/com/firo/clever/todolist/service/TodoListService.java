package com.firo.clever.todolist.service;

import com.firo.clever.todolist.entity.TodoList;

public interface TodoListService {

    void insert(TodoList todoList);
    void delete(Integer id);
    void update(TodoList todoList,Integer id);
    void findById(Integer id);
    void findAll();
}
