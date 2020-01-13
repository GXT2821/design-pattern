package com.telek.gt.imp;

import com.telek.gt.AbstractFile;

public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name){
        this.name = name;
    }
    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("对不起，不支持此方法！");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("对不起，不支持此方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持此方法！");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println(name + " 文件正在杀毒！");
    }
}
