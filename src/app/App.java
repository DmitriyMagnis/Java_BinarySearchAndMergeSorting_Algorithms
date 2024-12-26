package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        int higherBound = 20;
        int lowerBound = 1;
        int arrayLength = 10;

        int[] array = random.ints(arrayLength, lowerBound, higherBound).toArray();

        ArrayUtils.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.println("Enter value to search: ");
        int valueToSearch =  new Scanner(System.in).nextInt();

        System.out.println("BinarySearch result: " + ArrayUtils.binarySearch(array, valueToSearch));
    }
}
