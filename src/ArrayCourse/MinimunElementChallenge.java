package ArrayCourse;

import java.util.Scanner;

public class MinimunElementChallenge {

    private static Scanner sc = new Scanner(System.in);

    private static int[] readInteger(int count) {
        int[] newArray = new int[count];
        System.out.println("Enter " + count + " numbers");
        for (int i = 0; i < count; i++) {
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }

    public static int findMin(int[] newArray) {
        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] newArray = readInteger(5);
        int min = findMin(newArray);
        System.out.println(min);
    }
}
