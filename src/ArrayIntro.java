import java.util.Arrays;


public class ArrayIntro {
    public static void main(String[] args) {
        // Stores 10 integers.
        int[] myIntArray = new int[10];

        // Setting 50 at 6th index.
        myIntArray[5] = 50;

        // Stores 10 real numbers.
        double[] myDoubleArray = new double[10];

        // Setting 3.5 at 3rd index.
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        // Array Initializer is used to initialize an array.
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Element at first position = " + firstTen[0]);
        System.out.println("Length of firstTen array = " + firstTen.length);
        System.out.println("Element at last position = " + firstTen[firstTen.length - 1]);

        // Declaring an int array.
        int[] newArray;

        // Initializing newArray.
        newArray = new int[]{5, 4, 3, 2, 1};

        // Prints all elements of newArray.
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        // Prints default double values.
        double[] doubleArray = new double[5];
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }

        System.out.println();

        // Enhance for loop prints elements of firstTen array.
        for (int element : firstTen) {
            System.out.print(element + " ");
        }

        System.out.println();

        // Using Arrays class to print elements of array firstTen
        System.out.println(Arrays.toString(firstTen));

        // Assigning array to Object.
        Object object = firstTen;
        if (object instanceof int[]) {
            System.out.println("object is an int array");
        }
    }
}