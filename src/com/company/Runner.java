package com.company;

public class Runner {

    public static void main(String[] args) {

//        long tine = System.nanoTime();
//        utils.bubbleSort(randIntArr);
//        time = system.nanoTime() - time;
//
//        System.out.println("Time Taken: " + time);

        int[] arr = {1,2,3,4};

        InPlaceSorts.insertionSort(arr);
        InPlaceSorts.selectionSort(arr);
        InPlaceSorts.bubbleSort(arr);
        InPlaceSorts.quickSort(arr, 1, 3);
    }
}
