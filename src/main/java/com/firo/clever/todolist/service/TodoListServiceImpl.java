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
    public void update(Integer id) {

    }

    @Override
    public void findById(Integer id) {

    }

    @Override
    public void findAll() {

    }
}
