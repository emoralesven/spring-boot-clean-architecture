package com.hexagonal.architecture.application.usecases;

import com.hexagonal.architecture.domain.models.Task;
import com.hexagonal.architecture.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.architecture.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
