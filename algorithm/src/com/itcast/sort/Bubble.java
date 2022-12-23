package com.itcast.sort;

/*
  冒泡排序
 */
public class Bubble {

    public static void sort(Comparable[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(greater(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
        }

    }

    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    public static void exch(Comparable[] arr,int i,int j){
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
