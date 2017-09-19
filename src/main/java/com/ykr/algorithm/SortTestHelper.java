package com.ykr.algorithm;

import java.lang.reflect.Method;

public class SortTestHelper {
    private SortTestHelper(){}

    public static Integer[] generateRandomArray(int n ,int rangeL,int rangeR){
        assert rangeL <= rangeR;
        Integer[] arr=new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    // 判断arr数组是否有序
    public static boolean isSorted(Comparable[] arr){

        for( int i = 0 ; i < arr.length - 1 ; i ++ )
            if( arr[i].compareTo(arr[i+1]) > 0 )
                return false;
        return true;
    }


    public static  void  testSort(String sortClassName,Comparable [] arr){
        try{
            Class sortClass=Class.forName(sortClassName);
            //声明 方法名和参数类型
            Method method =sortClass.getMethod("sort",new Class[]{Comparable[].class});
            Object[] params = new Object[]{arr};
            long startTime = System.currentTimeMillis();
            // 调用排序函数,第一个参数是对象实例 ，第二参数是方法实参，由于是静态方法，第一个参数传null
            method.invoke(null,params);
            long endTime = System.currentTimeMillis();
            assert isSorted( arr );
            System.out.println( sortClass.getSimpleName()+ " : " + (endTime-startTime) + "ms" );
        }catch (Exception e){

        }
    }

    // 打印arr数组的所有内容
    public static void printArray(Comparable[] arr) {

        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }



}
