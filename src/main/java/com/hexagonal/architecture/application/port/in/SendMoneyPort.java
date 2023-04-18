package com.hexagonal.architecture.application.port.in;

public interface SendMoneyPort {
    public boolean send(SendMoneyCommand command);
}

