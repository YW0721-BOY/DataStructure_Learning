package com.itcast.sort;

/*
选择排序
 */
public class Selection {
    public static void sort (Comparable[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int index =i;
            for (int j = i+1; j < arr.length; j++) {
                if (greater(arr[index],arr[j])){
                    index=j;
                }
            }
            exch(arr,i,index);
        }
    }
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    public static void exch(Comparable[] arr,int i,int j){
        Comparable temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
