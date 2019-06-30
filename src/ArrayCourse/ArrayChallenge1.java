package ArrayCourse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge1 {
    private static Scanner sc = new Scanner(System.in);
    public static int[] initArray(int num){
        int[] intArray = new int[num];
        System.out.println("Enter " + num + " amount of numbers");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static int[] sortArray(int[] intArray) {
        int[] tempArray = new int[intArray.length];
        Arrays.sort(intArray);
        int counter = 0;
        for (int i = intArray.length-1; i >= 0; i--) {
            tempArray[counter] = intArray[i];
            counter++;
        }
        return tempArray;
    }

    public static int[] sortArray2(int[] intArray) {
        int[] sortedArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            sortedArray[i] = intArray[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] intArray = initArray(6);
        printArray(intArray);
        int[] sortedArray = sortArray(intArray);
        printArray(sortedArray);
    }
}
