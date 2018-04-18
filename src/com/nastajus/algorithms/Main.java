package com.nastajus.algorithms;

public class Main {

    public static void main(String[] args) {
        SelectionSort(new int[] {3,2,1});
        BubbleSort(new int[] {3,2,1});
    }

    static int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    //swap
                    int tempValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempValue;
                }
            }
        }
        System.out.println("BubbleSort result: " + Utils.PrintArray(array));
        return array;
    }

    static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            //swap
            if (smallestIdx != i) {
                int tempVal = array[smallestIdx];
                array[smallestIdx] = array[i];
                array[i] = tempVal;
            }
        }
        System.out.println("SelectionSort result: " + Utils.PrintArray(array));
        return array;
    }
}
