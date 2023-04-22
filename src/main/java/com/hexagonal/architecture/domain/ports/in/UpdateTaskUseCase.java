package com.hexagonal.architecture.domain.ports.in;

import com.hexagonal.architecture.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
