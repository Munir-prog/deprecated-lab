package com.mdev.service;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class TimerMethods {

    private final SimpleSort simpleSort;
    private final ReversedSort reversedSort;
    private final Scanner sc = new Scanner(System.in);

    public void startMethods() {
        System.out.println("Enter int:");
        int arrSize = sc.nextInt();
        simpleSort.countTimeForSimpleSort(arrSize);
        reversedSort.countTimeForReverseSort(arrSize);
    }

}
