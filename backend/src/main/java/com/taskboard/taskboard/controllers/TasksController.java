package com.taskboard.taskboard.controllers;

import com.taskboard.taskboard.models.TaskItem;
import com.taskboard.taskboard.services.TaskBusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TasksController {
    @Autowired
    TaskBusinessLogic taskBusinessLogic;

    @GetMapping("/tasks")
    public List<TaskItem> getAllTasks(){
        return taskBusinessLogic.getAllTasks();
    }

}
