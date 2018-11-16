package com.company;

public class InPlaceSorts {

    public static void swap(int[]arr. int i, int j)
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
            for (int j = i; i>0; j--)
            {
                if (list1[j-1]>list1[j])
                {
                    //if element at j-1 is greater than element at j, swap them
                    swap(list1, j-1, j)
                }
                else
                {
                    //else set j to 0
                    j=0;
                }
            }
        }
    }

    public static void selectionSort(double[] list1)
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
            for (int j=j+1; j<list1.length;j++)
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

    public static void bubbleSort(String[] list1)
    {
        //Declare an int to keep track of the number of swaps, initialize it to 1
        int swapCount=1;
        // While swap does not equal 0
        while (swapCount!=0)
        {
            //set the swap count to 0 for each run through the array
            swapCount=0;
            //Loop through the entire array
            for (int i=0; i<list1.length; i++)
            {
                if (list1[i]>list1[i+1])
                {
                    //if you find any two elements out of order, swap them and add one to the swap count
                    swap(list1, i, i+1);
                    swapCount++;
                }
            }

        }
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
