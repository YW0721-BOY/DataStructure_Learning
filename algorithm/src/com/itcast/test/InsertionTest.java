package com.itcast.test;

import com.itcast.sort.Insertion;

import java.awt.event.ActionListener;
import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr={0,23,12,42,15,22,34,55,10};

        Insertion.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
