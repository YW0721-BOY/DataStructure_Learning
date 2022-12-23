package com.itcast.sort;

/*
插入排序
 */
public class Insertion {

    public static void sort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j=i;j>0;j--){
                if (greater(arr[j-1],arr[j])){
                    exch(arr,j-1,j);
                }else {
                    break;
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
