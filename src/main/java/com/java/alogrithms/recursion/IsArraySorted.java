package com.java.alogrithms.recursion;

public class IsArraySorted {

    public static void main(String[] args) {

        int inputArray[] = new int[] { 1, 2, 3, 4, 5 };
        if (isArraySorted(0, inputArray)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }

    static boolean isArraySorted(int currentIndex, int inputArray[]) {

        if (currentIndex+1 == inputArray.length-1 || inputArray.length == 1) {

            return true;
        }
        if (inputArray[currentIndex] <= inputArray[currentIndex+1]) {

            return isArraySorted(++currentIndex, inputArray);
        }

        return false;
    }

}