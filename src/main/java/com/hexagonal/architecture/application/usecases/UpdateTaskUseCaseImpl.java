package com.hexagonal.architecture.application.usecases;

import com.hexagonal.architecture.domain.models.Task;
import com.hexagonal.architecture.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.architecture.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
