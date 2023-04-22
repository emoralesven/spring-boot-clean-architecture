package com.hexagonal.architecture.domain.ports.in;

import com.hexagonal.architecture.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTask();
 }
