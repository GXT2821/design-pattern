package com.telek.gt.command;

public class Demo {

    public static void main(String[] args){
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
