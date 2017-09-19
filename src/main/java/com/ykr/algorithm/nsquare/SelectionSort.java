package com.ykr.algorithm.nsquare;

/**
 * Created by yangkr on 2017/9/14.
 *
 * 选择排序
 */
public class SelectionSort {
    private SelectionSort(){}

    public static void sort(Comparable [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){                 //n-1最后一个值不用比较
            //选出每个子序列最小的值
            int minIndex=i;                     //内层 初始化minIdex为i值
            for (int j=i+1;j<n;j++){           //内层循环找出子序列中的最小值Index
                if (arr[minIndex].compareTo(arr[j])>0){
                    minIndex=j;
                }
            }
            sawp(arr,minIndex,i);
        }
    }

    private static void sawp(Comparable [] arr, int minIndex, int j) {
            Comparable temp=arr[minIndex];
            arr[minIndex]=arr[j];
            arr[j]=temp;
    }

    public static void main(String[] args) {

        Integer [] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
