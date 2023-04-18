package com.hexagonal.architecture.adapter.out;

import com.hexagonal.architecture.application.port.out.LoadAccountPort;
import com.hexagonal.architecture.application.port.out.UpdateAccountPort;
import com.hexagonal.architecture.common.PersistenceAdapter;
import com.hexagonal.architecture.domain.Account;

@PersistenceAdapter
public class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountPort {

    private final SpringAccountRepository accountRepository;

    public AccountPersistenceAdapter(SpringAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account load(Long id) {
        return accountRepository
                .findById(id)
                .map(AccountMapper::entityToDomain)
                .orElseThrow(RuntimeException::new); // mejorar exception
    }

    @Override
    public void update(Account account) {
        accountRepository.save(AccountMapper.domainToEntity(account));
    }
}