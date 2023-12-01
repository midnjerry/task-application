package com.taskboard.taskboard.repository;

import com.taskboard.taskboard.models.TaskItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskItemRepository extends JpaRepository<TaskItem, Integer> {
}
