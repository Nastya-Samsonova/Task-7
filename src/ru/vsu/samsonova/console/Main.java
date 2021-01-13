package ru.vsu.samsonova.console;

import ru.vsu.samsonova.logic.FindingTheIndexOfAnDesiredElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = readArray();
        int result = FindingTheIndexOfAnDesiredElement.findDesiredArrayElement(arr);
        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println("The desired array element " + result);
    }

    public static int[] readArray() {
        System.out.println("Enter array ");
        try {
            return toIntArray(new Scanner(System.in).nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You enter an incorrect element!");
            return readArray();
        }

    }

    public static int[] toIntArray(String str) {
        return Arrays.stream(str.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}

