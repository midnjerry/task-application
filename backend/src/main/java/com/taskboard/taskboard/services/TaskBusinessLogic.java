package com.taskboard.taskboard.services;

import com.taskboard.taskboard.models.TaskItem;
import com.taskboard.taskboard.repository.TaskItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskBusinessLogic {
    @Autowired
    TaskItemRepository taskItemRepository;

    public List<TaskItem> getAllTasks(){
        return taskItemRepository.findAll();
    }

}
