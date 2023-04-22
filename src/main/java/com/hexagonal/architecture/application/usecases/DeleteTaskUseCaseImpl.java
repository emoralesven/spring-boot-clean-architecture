package com.hexagonal.architecture.application.usecases;

import com.hexagonal.architecture.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.architecture.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public boolean deleteTask(Long Id) {
        return taskRepositoryPort.deleteById(Id);
    }
}
