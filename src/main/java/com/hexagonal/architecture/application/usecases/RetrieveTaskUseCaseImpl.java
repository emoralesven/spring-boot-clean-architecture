package com.hexagonal.architecture.application.usecases;

import com.hexagonal.architecture.domain.models.Task;
import com.hexagonal.architecture.domain.ports.in.RetrieveTaskUseCase;
import com.hexagonal.architecture.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor



public class RetrieveTaskUseCaseImpl  implements RetrieveTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepositoryPort.findAll();
    }
}
