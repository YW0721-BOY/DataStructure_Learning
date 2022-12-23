package com.itcast.test;

import com.itcast.sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr ={23,12,24,56,11,10,0,2,3,19};

        Selection.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
