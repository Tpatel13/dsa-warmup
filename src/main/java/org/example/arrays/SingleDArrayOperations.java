package org.example.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class SingleDArrayOperations {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10, 20);

        int[] randomArray2 = getRandomArray(20, 40);

//        System.out.println(Arrays.toString(randomArray));
//        System.out.println(replaceValue(randomArray, 1, 2));
//        System.out.println(Arrays.toString(randomArray));
//        int[] updatedArray = Arrays.stream(randomArray).map(e -> e + 1).toArray();
//
//
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(getMiddleArray(randomArray)));
        System.out.println(binarySearch(randomArray, randomArray[(int) new Random().nextInt(randomArray.length)]));
    }


    public static int binarySearch(int[] unsortedArray, int searchElement) {
        Arrays.sort(unsortedArray);

        int right = unsortedArray.length;
        int left = 1;


        while (left < right) {
            int mid = left + (right - left) / 2;

            if (searchElement < unsortedArray[mid]) {

                right = mid;
            } else if (searchElement > unsortedArray[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return 0;
    }

    public static int[] getMiddleArray(int[] myArray) {
        if (myArray.length < 3) return myArray;

        int[] middleArray = new int[myArray.length - 2];

        for (int counter = 0; counter < myArray.length - 2; counter++) {
            middleArray[counter] = myArray[1 + counter];
        }
        return middleArray;
    }

    private static boolean replaceValue(int[] inputArray, int baseValue, int newValue) {
        if (inputArray == null) return false;

        boolean statusFlag = false;
        int replacedValueCounter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == baseValue) {
                inputArray[i] = newValue;
                statusFlag = true;
                replacedValueCounter++;
            }
        }
        System.out.println("Total Values updated :: " + replacedValueCounter);
        return statusFlag;
    }

    private static boolean searchFromArray(int[] inputArray, int searchElement) {
        if (inputArray == null) return false;

        for (int eachElement : inputArray) {
            if (eachElement == searchElement) return true;
        }
        return false;
    }

    private static int[] getRandomArray(int arraySize, int upperBound) {
        try {
            Stack<String> stringStack=new Stack<>();
            StringBuilder stringBuild=new StringBuilder();

            if (arraySize < 0) throw new RuntimeException();

            int[] intArray = new int[arraySize];
            Random random = new Random();
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = random.nextInt(upperBound);
            }
            return intArray;
        } catch (Exception e) {
            System.out.println("Error while creating array ");
            System.out.println(e.getMessage());
            return null;
        }

    }


}