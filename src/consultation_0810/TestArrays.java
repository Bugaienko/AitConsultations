package consultation_0810;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int var = 10;
        int[] ints = new int[1];
        ints[0] = var;

        System.out.println(Arrays.toString(ints));

        int var2 = 15;

        int[] newArray = Arrays.copyOf(ints, 2);
        newArray[1] = var2;
        printArray(newArray);
        printArray(newArray, 10);




    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "; " : ""));
        }

        System.out.print("]\n");

    }
    public static String printArray(int[] arr, int a) {
        System.out.println("Я устал, я не могу печатать");
        return "tt" + a;
    }

}
