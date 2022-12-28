package com.itcast.sort;

public class Merge {
    private static Comparable[] assist;
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort(Comparable[] a) {
        assist = new Comparable[a.length];

        int lo = 0;
        int high = a.length - 1;
        sort(a, lo, high);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        //做安全校验
        if (hi <= lo) {
            return;
        }
        //对lo到hi之间的数据分为两个组
        int mid = lo + (hi - lo) / 2;
        //分别对每一组数据进行排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        //再把两个组中的数据进行归并

        merge(a, lo, mid, hi);

    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        //定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;
        //遍历：移动p1和p2,比较对应索引处的值，找出小的那个，发到辅助数据的对应索引处
        while (p1 <= mid && p2 <= hi) {
            //比较对应索引处的值
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }

        //遍历：如果p1的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数据的对应索引处
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //遍历：如果p2的指针没有走完，那么顺序移动p2指针，把对应的元素放到辅助数据的对应索引处
        while (p2 <= hi) {
            assist[i++] = a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }
    }




}
