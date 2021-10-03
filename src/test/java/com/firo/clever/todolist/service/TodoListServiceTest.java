package com.firo.clever.todolist.service;

import com.firo.clever.todolist.entity.TodoList;
import com.firo.clever.todolist.repository.TodoListRepository;
import com.firo.clever.todolist.repository.TodoListRepositoryImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoListServiceTest {

    private TodoListService todoListService;

    @BeforeEach
    @Test
    void setUp(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        todoListService = new TodoListServiceImpl();
    }

    @Test
    void testInsert(){
        TodoList todo = new TodoList("apa lihat-lihat");
        todoListService.insert(todo);
        assertNotNull(todo.getId());
    }

    @Test
    void testDelete(){
        todoListService.delete(8);
    }

    @Test
    void testUpdate(){
        TodoList todoList = new TodoList("kenapa aku ganteng");
        todoListService.update(todoList,1);
    }

    @Test
    void testSelectById(){
        todoListService.findById(5395);
        assertNotNull(todoListService);
    }

    @Test
    void testSelectAll(){
        todoListService.findAll();
    }
}
