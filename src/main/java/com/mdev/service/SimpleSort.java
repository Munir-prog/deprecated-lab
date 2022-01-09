package com.mdev.service;

import java.util.*;

import static com.mdev.util.ArrayUtil.*;

public class SimpleSort {

    public void countTimeForSimpleSort(int n) {
        var array = generateArray(n);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
