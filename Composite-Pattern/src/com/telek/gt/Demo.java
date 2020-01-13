package com.telek.gt;

import com.telek.gt.imp.Folder;
import com.telek.gt.imp.TextFile;
import com.telek.gt.imp.VideoFile;

public class Demo {
    public static void main(String[] args){
        AbstractFile f1 = new Folder("文件");
        AbstractFile f2 = new Folder("视频");
        AbstractFile f3 = new Folder("文本文件");
        AbstractFile f4 = new VideoFile("视频1");
        f1.add(f2);
        f1.add(f3);
        f1.add(f4);
        AbstractFile f21 = new VideoFile("视频2");
        AbstractFile f22 = new VideoFile("视频3");
        AbstractFile f23 = new VideoFile("视频4");
        AbstractFile f24 = new Folder("视频文件");
        AbstractFile f241 = new VideoFile("视频24");
        f2.add(f21);
        f2.add(f22);
        f2.add(f23);
        f2.add(f24);
        f24.add(f241);
        AbstractFile f31 = new TextFile("文本1");
        AbstractFile f32 = new TextFile("文本2");
        AbstractFile f33 = new TextFile("文本3");
        f3.add(f31);
        f3.add(f32);
        f3.add(f33);
        f1.killVirus();
    }
}
