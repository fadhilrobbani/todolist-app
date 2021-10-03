package com.firo.clever.todolist.repository;

import com.firo.clever.todolist.entity.TodoList;

public interface TodoListRepository {

    void insertInto(TodoList todoList);
    void deleteFrom(Integer id);
    void updateWhere(Integer id);
    void selectById(Integer id);
    void selectAll();
}
