package com.ykr.algorithm.nsquare;

import com.ykr.algorithm.SortTestHelper;

public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable [] arr){
        int n=arr.length;
        if (n<=1){
            return;
        }
        for (int i =1;i<n;i++){
            for (int j=i;j>0&&(arr[j-1].compareTo(arr[j])>0);j--){
                    sawp(arr,j-1,j);
            }
        }
    }
    private static void sawp(Comparable [] arr, int minIndex, int j) {
        Comparable temp=arr[minIndex];
        arr[minIndex]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int N = 2000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 20000);
        SortTestHelper.testSort("com.ykr.algorithm.nsquare.InsertionSort", arr);
    }
}
