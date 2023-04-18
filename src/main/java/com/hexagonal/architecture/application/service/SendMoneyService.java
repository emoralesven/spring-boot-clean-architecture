package com.hexagonal.architecture.application.service;


import com.hexagonal.architecture.application.port.in.SendMoneyCommand;
import com.hexagonal.architecture.application.port.in.SendMoneyPort;
import com.hexagonal.architecture.application.port.out.LoadAccountPort;
import com.hexagonal.architecture.application.port.out.UpdateAccountPort;
import com.hexagonal.architecture.common.UseCase;
import com.hexagonal.architecture.domain.Account;

import javax.transaction.Transactional;

@UseCase
public class SendMoneyService implements SendMoneyPort {

    private final LoadAccountPort loadAccountPort;
    private final UpdateAccountPort updateAccountPort;

    public SendMoneyService(LoadAccountPort loadAccountPort, UpdateAccountPort updateAccountPort) {
        this.loadAccountPort = loadAccountPort;
        this.updateAccountPort = updateAccountPort;
    }

    @Transactional
    @Override
    public boolean send(SendMoneyCommand command) {

        Account source = loadAccountPort.load(command.getSourceId());
        Account target = loadAccountPort.load(command.getTargetId());

        if(!source.isBalanceGreaterThan(command.getAmount())) {
            throw new RuntimeException("Source account not have enough balance amount ... ");
        }

        target.plus(command.getAmount());
        source.subtract(command.getAmount());

        updateAccountPort.update(source);
        updateAccountPort.update(target);

        return true;
    }
}