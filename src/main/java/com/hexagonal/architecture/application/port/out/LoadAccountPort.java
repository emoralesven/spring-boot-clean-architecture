package com.hexagonal.architecture.application.port.out;


import com.hexagonal.architecture.domain.Account;

public interface LoadAccountPort {
    Account load(Long id);
}