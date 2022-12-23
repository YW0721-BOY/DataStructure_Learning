package com.itcast.test;

import com.itcast.sort.Bubble;

import java.sql.Array;
import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr ={99,12,23,70,30,45,20,11,0,2};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
