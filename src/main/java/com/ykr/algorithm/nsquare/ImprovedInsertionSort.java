package com.ykr.algorithm.nsquare;

import com.ykr.algorithm.SortTestHelper;

/**
 * 改进的插入排序，减少赋值操作
 */
public class ImprovedInsertionSort {
    private ImprovedInsertionSort(){}

    public static void sort(Comparable [] arr){
        int n=arr.length;
        if (n<=1){
            return;
        }
        for (int i =1;i<n;i++){
            int minIndex=i;
            for (int j=i-1;j>=0;j--){
                    if (arr[minIndex].compareTo(arr[j])>0){
                        arr[j-1]=arr[j];
                    }else {
                        sawp(arr,minIndex,j+1);
                    }
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
        SortTestHelper.printArray(arr);
    }
}
