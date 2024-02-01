package ru.kudaiberdieva.homeworks.homework27;

import java.util.Arrays;

public class MethodsApp {

    public static void main(String[] args) {
        int[] arr1 = {5,4,1,6,1,7,8,9,10};
        int[] arr2 = {2,5,4,8,9};

        try {
            int[] resArr1 = getNewArrayFromLastOne(arr1);
            System.out.println(Arrays.toString(resArr1));
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        try {
            int[] resArr2 = getNewArrayFromLastOne(arr2);
            System.out.println(Arrays.toString(resArr2));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }

        int[] nums1 = {1,2,1,2,1,2,2};
        int[] nums2 = {2,3,1,4};
        int[] nums3 = {1};

        System.out.println(containsOneOrTwo(nums1));
        System.out.println(containsOneOrTwo(nums2));
        System.out.println(containsOneOrTwo(nums3));
    }

    public static int[] getNewArrayFromLastOne (int[] arr) {
        int lastOneIndex = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 1){
                lastOneIndex = i;
                break;
            }
        }
       if (lastOneIndex == -1){
           throw new RuntimeException("Входной массив не содержит единиц");
       }
           int[] resultArray = new int[arr.length - lastOneIndex - 1];
           for (int i = lastOneIndex + 1, j = 0; i < arr.length; i++, j++) {
               resultArray[j] = arr[i];
           }
           return resultArray;
    }

    public static boolean containsOneOrTwo(int[] array) {
        boolean containsOne = false;
        boolean containsTwo = false;

        for (int num : array) {
            if (num != 1 && num != 2) {
                return false;
            }
            if (num == 1) {
                containsOne = true;
            } else {
                containsTwo = true;
            }
        }

        return containsOne && containsTwo;
    }
}
