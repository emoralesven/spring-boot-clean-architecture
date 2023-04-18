package com.hexagonal.architecture.application.port.out;

import com.hexagonal.architecture.domain.Account;

public interface UpdateAccountPort {

    void update(Account account);
}