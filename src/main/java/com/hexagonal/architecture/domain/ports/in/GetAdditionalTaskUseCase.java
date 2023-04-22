package com.hexagonal.architecture.domain.ports.in;

import com.hexagonal.architecture.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskUseCase {
     AdditionalTaskInfo getAdditionalTaskInfo (Long id);
}
