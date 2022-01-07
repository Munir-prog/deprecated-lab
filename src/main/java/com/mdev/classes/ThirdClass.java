package com.mdev.classes;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ThirdClass {
    private final FirstClass fc;
    private final TimeConsumingClass tcc;
    private final Scanner sc = new Scanner(System.in);

    public void entrypoint() {
        fc.sayWoow();
        fc.loadFile();
        tcc.doSomethingTimeConsuming(takeTime());
    }

    public int takeTime() {
        System.out.println("input any integer for having fun");
        return sc.nextInt();
    }
}