package com.company;

public class InPlaceSorts {

    public static void swap(int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void insertionSort(int[] list1)
    {
        //loop through the entire array, use an index i
        for (int i = 0; i < list1.length; i++)
        {
            //loop from index i back to the beginning of the array, use index j
            for (int j = i; j>0; j--)
            {
                if (list1[j-1]>list1[j])
                {
                    //if element at j-1 is greater than element at j, swap them
                    swap(list1, j-1, j);
                }
                else
                {
                    //else set j to 0
                    j=0;
                }
            }
        }
    }

    public static void selectionSort(int[] list1)
    {
        //declare two ints for remembering the position we are swapping into, and the current minimum, initialize them to 0
        int pos = 0;
        int currentMin = 0;
        // for loop through the entire array using an index variable
        for (int i = 0; i < list1.length; i++)
        {
            //set swap position to index, and current minimum to the number at index
            pos = i;
            currentMin = list1[i];
            //if you find a number less than the min, set swap position and current minimum
            int j=pos;
            for (j=j+1; j<list1.length;j++)
            {
                //if element at j-1 is greater than element at j, swap them
                if (list1[j]<currentMin)
                {
                    currentMin=j;
                }
                //swap the number at index with the number at swap position
                swap(list1, currentMin, pos);
            }
        }
    }

    public static void bubbleSort(int[] list1)
    {
        for(int k = 0; k < list1.length; k++)
        {
            for (int i=0; i<list1.length-1; i++)
            {
                if (list1[i] > list1[i+1])
                {
                    int temp = list1[i];
                    list1[i] = list1[i+1];
                    list1[i+1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left<right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot+1, right);
        }
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j<right;j++)
        {
            if (arr[j]<=pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    public String[] randomStringArr(int num, int length)
    {
        String[] arr= new String[num];
        while (num>0)
        {
            int i=0; String s = "";
            while (i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
}
