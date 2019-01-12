package com.he.boot.calculate;

/**
 * @Author: 和世昌
 * @date: 2019/1/9
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,0,2,9,4,2,0};


    }

    public int [] sort(int[] arr,int start,int end){
        if(arr.length == 1){
            return arr;
        }else {
            while (start<end){
                int small = arr[start];
                int big = arr[end];
                start++;
                //先走小的
                while (small>=arr[start]){
                    arr[start] = small;
                    start++;
                }
                //
            }


        }
        return arr;
    }
}
