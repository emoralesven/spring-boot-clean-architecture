package com.hexagonal.architecture.domain.ports.in;

import com.hexagonal.architecture.domain.models.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);
}
