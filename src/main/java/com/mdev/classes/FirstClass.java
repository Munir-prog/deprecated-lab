package com.mdev.classes;

import java.io.File;

public class FirstClass {
    public void sayWoow() {
        System.out.println("woow");
    }

    public void loadFile() {
        var file = new File("/home/egor/someVideo.mkv");
        System.out.println(file.getPath());
    }
}