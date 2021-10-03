package com.firo.clever.todolist.service;

import com.firo.clever.todolist.entity.TodoList;
import com.firo.clever.todolist.repository.TodoListRepository;
import com.firo.clever.todolist.repository.TodoListRepositoryImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoListServiceTest {

    private TodoListRepository todoListRepository;
    private TodoListService todoListService;

    @BeforeEach
    @Test
    void setUp(){
        todoListRepository = new TodoListRepositoryImpl();
        todoListService = new TodoListServiceImpl();
    }

    @Test
    void testInsert(){
        TodoList todo = new TodoList("aku mau makan nanti");
        todoListService.insert(todo);
        assertNotNull(todo.getId());
    }

    @Test
    void testDelete(){
        todoListService.delete(8);
    }
}
