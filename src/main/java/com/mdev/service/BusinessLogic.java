package com.mdev.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.util.Scanner;

public class BusinessLogic {


    @Deprecated
    public void sayHello(){
        System.out.println("This method saying Hello");
    }

    @Deprecated
    @SneakyThrows
    public void sayHello10(){
        Thread.sleep(500L);
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }

}
