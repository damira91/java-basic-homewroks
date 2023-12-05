package ru.kudaiberdieva.homeworks.homework17;

public class MergeSort {
    public static int[] sort(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int middle = array.length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        System.arraycopy(array, 0, leftArray, 0, middle);
        System.arraycopy(array, middle, rightArray, 0, array.length - middle);

        sort(leftArray);
        sort(rightArray);

        merge(array, leftArray, rightArray);

        return array;
    }
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;


        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }

        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
    }
}
