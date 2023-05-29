package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] array = new int[]{1, 56, 43, 78, 29, 5, 89, 102, 17, 200, 38, 55};

        quickSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort ( int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition ( int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap (int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = tmp;
    }
}
