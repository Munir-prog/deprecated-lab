package com.mdev.classes;

import java.util.Arrays;
import java.util.Random;

public class TimeConsumingClass {
    private final Random ran = new Random();

    public void doSomethingTimeConsuming(int n) {
        var randomArr = createNewRandomDoubleArray(n);
        sortAsc(randomArr);
        sortDesc(randomArr);
    }

    public double[] createNewRandomDoubleArray(Integer numElems) {
        double[] arr = new double[numElems];
        for (int i = 0; i < numElems; i++) {
            arr[i] = ran.nextDouble();
        }
        return arr;
    }

    public void sortAsc(double[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            double key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public void sortDesc(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] < valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }
}
