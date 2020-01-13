package com.telek.gt.imp;

import com.telek.gt.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    private List<AbstractFile> childList = new ArrayList<>();
    private String name;

    public Folder(String name){
        this.name = name;
    }
    @Override
    public void add(AbstractFile abstractFile) {
        childList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        childList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile)childList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println(name + "文件夹正在杀毒！");
        for(AbstractFile abstractFile : childList){
            abstractFile.killVirus();
        }
    }
}
