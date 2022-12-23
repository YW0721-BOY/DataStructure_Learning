package com.itcast.sort;

/*
希尔排序
 */
public class Shell {

    public static void sort(Comparable[] a){
        //1.根据数组a的长度确定增长量
        int h=1;
        while (h<a.length/2){
            h=2*h+1;
        }
        while (h>=1){
            for(int i=h;i<a.length;i++){
                for (int j=i;j>=h;j-=h){
                    if (greater(a[j-h],a[j])){
                        exch(a,j-h,j);
                    }else {
                        break;
                    }
                }
            }
            h=h/2;
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
