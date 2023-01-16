import java.util.Arrays;
import java.util.Random;

public class ArraysClass {

    public static void main(String[] args) {
        // Stores a random array.
        int[] firstArray = ArraysClass.getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // Sorts contents of firstArray in increasing order.
        Arrays.sort(firstArray);
        System.out.println("Sorted Array = " + Arrays.toString(firstArray));

        // Filling a new array with the same value.
        int[] secondArray = new int[10];
        System.out.println("Default Array = " + Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println("Array is filled with 5 = " + Arrays.toString(secondArray));

        // Copying contents of an array.
        int[] thirdArray = ArraysClass.getRandomArray(10);
        System.out.println("3rd Array = " + Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Copy of 3rd Array = " + Arrays.toString(fourthArray));

        // Using Binary Search to search through an array.
        String[] stringArray = {"Able", "Jane", "Mark", "Ralph", "David"};

        // Sorting stringArray as a requirement for binary search.
        Arrays.sort(stringArray);
        System.out.println("Sorted stringArray = " + Arrays.toString(stringArray));

        // Using binarySearch method to search for "Mark" in stringArray.
        if (Arrays.binarySearch(stringArray, "Mark") != -1) {
            System.out.println("Found Mark in the list");
        }

        // Using equals method to check whether two arrays are equal.
        int[] a = ArraysClass.getRandomArray(5);
        int[] b = Arrays.copyOf(a, a.length);
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    /**
     * Creates an integer array containing random elements.
     *
     * @param length Size of array.
     * @return A random integer array.
     */
    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];

        // Assigns random number to each element in newInt array.
        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
