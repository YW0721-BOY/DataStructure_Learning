package com.itcast.test;

import com.itcast.sort.Shell;

import java.util.ArrayList;
import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a={8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
