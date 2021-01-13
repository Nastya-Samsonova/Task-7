package ru.vsu.samsonova.logic;

public class FindingTheIndexOfAnDesiredElement {
    public static int findDesiredArrayElement(int[] arr) {
        int rightMaxOrMinElement = Math.max(findIndexOfMinElement(arr), findIndexOfMaxElement(arr));
        int result = 0;
        if (rightMaxOrMinElement < arr.length - 1) {
            result = rightMaxOrMinElement + 1;
        }
        if (rightMaxOrMinElement > arr.length - 1) {
            result = rightMaxOrMinElement - 1;
        }
        if (rightMaxOrMinElement == arr.length - 1) {
            if (findIndexOfMinElement(arr) == findIndexOfMaxElement(arr) + 1) {
                result = rightMaxOrMinElement - 2;
            }
            if (findIndexOfMinElement(arr) == findIndexOfMaxElement(arr) - 1) {
                result = rightMaxOrMinElement - 1;
            }
            if (findIndexOfMaxElement(arr) > findIndexOfMinElement(arr) + 1) {
                result = rightMaxOrMinElement - 1;
            }
            if (findIndexOfMinElement(arr) > findIndexOfMaxElement(arr) + 1) {
                result = rightMaxOrMinElement - 1;
            }
        }
        if (arr.length == 1 || arr.length == 2) {
            result = 0;
        }
        return result;
    }

    private static int findIndexOfMaxElement(int[] arr) {
        int indexMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            }
        }
        return indexMax;
    }

    private static int findIndexOfMinElement(int[] arr) {
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }
}
