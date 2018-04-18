package com.nastajus;

public class Main {

    public static void main(String[] args) {
        SelectionSort();
        BubbleSort(new int[] {3,2,1});
    }

    static int[] BubbleSort(int[] array){
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
        System.out.println("Sorted: " + Utils.PrintArray(array));
        return array;
    }

    static int[] SelectionSort(){
        return new int[0];
    }
}
