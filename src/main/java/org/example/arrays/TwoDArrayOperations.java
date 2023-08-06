package org.example.arrays;

import java.util.Arrays;
import java.util.Random;

public class TwoDArrayOperations {

    public static void main(String[] args) {

        TwoDArrayOperations twoDArrayOperations = new TwoDArrayOperations();
        int[][] randomArray = new TwoDArrayOperations().createRandom2DArray(3, 4, 10);

        twoDArrayOperations.traverseArray(randomArray);
        twoDArrayOperations.updateElement(randomArray, 20, 20);
        twoDArrayOperations.traverseArray(randomArray);

    }

    private int[][] createRandom2DArray(int row, int col, int upperBound) {
        if (row <= 0 || col <= 0 || upperBound < 0) return null;

        int[][] array = new int[row][col];

        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextInt(upperBound);
            }
        }

        return array;
    }

    private void traverseArray(int[][] array) {
        if (array == null || array.length == 0) return;

        int colLength = array[0].length;
        System.out.println(" ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < colLength; col++) {
                System.out.print(array[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private int[][] searchArray(int[][] array, int valueToFind) {
        if (array == null || array.length == 0) return null;

        int colLength = array[0].length;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < colLength; col++) {
                if (array[row][col] == valueToFind) return new int[][]{{row, col}};
            }
        }
        return null;
    }

    private void updateElement(int[][] array, int oldValue, int newValue) {
        int[][] elementIndex = searchArray(array, oldValue);
        if (elementIndex != null) {
            array[elementIndex[0][0]][elementIndex[0][1]] = newValue;
            return;
        }
        System.out.println(" ");
        System.out.println("Could not find specified value " + oldValue);
    }
}
