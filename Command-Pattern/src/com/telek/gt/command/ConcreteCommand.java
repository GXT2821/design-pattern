package com.telek.gt.command;

public class ConcreteCommand extends Command {

    private Receiver receiver = new Receiver();
    @Override
    public void execute() {
        receiver.action();
    }
}
