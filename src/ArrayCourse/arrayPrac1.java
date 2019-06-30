package ArrayCourse;

import java.util.Scanner;

public class arrayPrac1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many number would you like to enter? ");
        int limit = sc.nextInt();
        int[] intValues = initArray(limit);
        printArray(intValues);
        int avg = getAverage(intValues);
        System.out.println("The average of this array is: " + avg);
    }

    public static int[] initArray(int limit){
        int[] newIntArray = new int[limit];
        System.out.println("Enter " + limit + " numbers... ");
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i]= sc.nextInt();
        }
        return newIntArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i+1 + ". " + intArray[i]);
        }
    }

    public static int getAverage(int[] intArray) {
        int sum=0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum/intArray.length;
    }
}
