package com.telek.gt.facade;

public class EncryptFacade {

    private FileRead fileRead;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;

    public EncryptFacade(){
        this.fileRead = new FileRead();
        this.fileWriter = new FileWriter();
        this.cipherMachine = new CipherMachine();
    }

    public void fileEncry(String path){
        fileRead.Read(path);
        cipherMachine.Encrypt(path);
        fileWriter.Write(path);
    }
}
