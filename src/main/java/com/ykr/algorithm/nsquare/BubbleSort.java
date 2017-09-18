package com.ykr.algorithm.nsquare;

/**
 * Created by yangkr on 2017/9/18.
 */
public class BubbleSort {
    public static void sort(Comparable [] arr){
        int n=arr.length;

        int newn=n;
        do {
            newn=0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    sawp(arr, i, i + 1);
                    // 可以记录最后一次的交换位置,在此之后的元素在下一轮扫描中均不考虑
                    newn=i+1;
                }
            }
            n=newn;
        }while (newn > 0) ;
        }

    private static void sawp(Comparable[] arr, int i, int j) {
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {

        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
