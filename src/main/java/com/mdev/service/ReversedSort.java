package com.mdev.service;

import java.util.Arrays;
import java.util.Collections;

import static com.mdev.util.ArrayUtil.*;

public class ReversedSort {

    public void countTimeForReverseSort(int n) {
        var array = generateArray(n);
        Arrays.sort(array, Collections.reverseOrder());
    }

}
