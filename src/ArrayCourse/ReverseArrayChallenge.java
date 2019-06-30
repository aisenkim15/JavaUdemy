package ArrayCourse;

public class ReverseArrayChallenge {

    public static void reverse(int[] array) {
        int temp;
        int maxLength = array.length - 1;
        for (int i = 0; i < (maxLength / 2); i++) {
            temp = array[i];
            array[i] = array[maxLength];
            array[maxLength] = temp;
            maxLength--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        reverse(array);
        printArray(array);
    }

}
