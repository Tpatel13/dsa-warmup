package projects;

import javax.swing.event.ListSelectionEvent;
import java.util.*;

public class Excercise1 {

    public static void main(String[] args) {

        int[] myArray = {100, 20, 203, 405, 5030, 201, 10};

//        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
//        System.out.println(maxProduct(myArray));
//        System.out.println(permutation());
//        System.out.println(rotateMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
//        System.out.println(reverseWords("a good   example"));

//        System.out.println(findDuplicates(myArray));
        System.out.println(Arrays.toString(reverseArray(myArray)));
    }

    public static int sumDiagonalElements(int[][] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int rowLength = array.length;
        //Assuming symmatric matrix
        int colLength = array[0].length;

        int sum = 0;
        for (int row = 0; row < rowLength; row++) {
            sum = sum + array[row][1];
        }

        return sum;
    }

    public static int[] findTopTwoScores(int[] array) {
        int[] topTwoScores = null;
        // TODO
        if (array == null || array.length == 0) {
            return topTwoScores;
        } else if (array.length == 1) {
            topTwoScores = new int[]{array[0], 0};
            return topTwoScores;
        } else if (array.length == 2) {
            topTwoScores = new int[]{array[0], array[1]};
            return topTwoScores;
        }

        topTwoScores = new int[]{array[0], array[1]};

        for (int counter = 2; counter < array.length; counter++) {
            if (array[counter] > topTwoScores[0]) {
                topTwoScores[1] = topTwoScores[0];
                topTwoScores[0] = array[counter];

            } else if (array[counter] > topTwoScores[1]) {
                topTwoScores[1] = array[counter];
            }
        }
        return topTwoScores;
    }

    static int findMissingNumberInArray(int[] arr) {
        // TODO
        int missingNumber = 0;

        int arrayLength = arr.length;

        int expectedSum = ((arrayLength) * (arrayLength + 1) / 2);

        int arraySum = 0;

        for (int j : arr) {
            arraySum = arraySum + j;
        }
        return expectedSum - arraySum;
    }

    static int[] removeDuplicateFromArrayV1(int[] array) {
        int arrayLength = array.length;

        int[] uniQueArray = new int[arrayLength];
        int index = 0;
        for (int i = 0; i < arrayLength; i++) {

            boolean isDuplicate = false;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniQueArray[index++] = array[i];
            }
        }
        return Arrays.copyOf(uniQueArray, index);
    }

    public static int removeDuplicates(int[] nums) {
        //TODO
        if (nums == null) {
            return 0;
        } else if (nums.length == 0) {
            return nums[0];
        }

        int counter = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                counter++;
                nums[counter] = nums[i];
            }
        }
        return counter + 1;
    }

//    public static int maxProfit(int[] prices) {
//        // TODO
//        if (prices == null || prices.length == 0) return 0;
//        if (prices.length == 1) return prices[0];
//
//        int maxProfit = 0;
//        int profitOfDay = 0;
//        int lestDay = 0;
//
//        for (int day = 0; day < prices.length; day++) {
//            if (prices[day] < lestDay) {
//                lestDay = prices[day];
//            }
//            profitOfDay=prices[day]-lestDay;
//            if(maxProfit<profitOfDay)maxProfit=profitOfDay;
//        }
//        return maxProfit;
//    }

    public static int[] twoSum(int[] nums, int target) {
        // TODO

        for (int eachNumber = 0; eachNumber < nums.length; eachNumber++) {

            for (int j = 0; j < nums.length; j++) {
                if (eachNumber == j) continue;
                if (nums[eachNumber] + nums[j] == target) {
                    return new int[]{eachNumber, j};
                }
            }
        }
        return null;
    }

    public static String maxProduct(int[] intArray) {
        int maxValue = 0;
        int maxValue2 = 0;
        // TODO
        for (int elements = 1; elements < intArray.length; elements++) {
            if (intArray[elements] > maxValue) {
                maxValue2 = maxValue;
                maxValue = intArray[elements];
            } else if (intArray[elements] > maxValue2) {
                maxValue2 = intArray[elements];
            }
        }

        return maxValue2 + "," + maxValue;
    }

    public static ArrayList<ArrayList<Integer>> findPassableLanes(char[][] matrix) {

        ArrayList<Integer> rowList = new ArrayList<>();
        ArrayList<Integer> columnList = new ArrayList<>();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int row = 0; row < matrix.length - 1; row++) {
            if (matrix[row][0] == '0' && dfs(matrix, row, 0, 1)) {
                rowList.add(row);
            }
        }

        for (int column = 0; column < matrix[0].length - 1; column++) {
            if (matrix[0][column] == '0' && dfs(matrix, 0, column, 0)) {
                columnList.add(column);
            }
        }

        result.add(rowList);
        result.add(columnList);
        return result;
    }

    public static boolean dfs(char[][] matrix, int row, int column, int flag) {

        if (flag == 1 && column == matrix[0].length - 1 && matrix[row][matrix[0].length - 1] == '0') return true;

        if (flag == 0 && row == matrix.length - 1 && matrix[matrix.length - 1][column] == '0') return true;

        if (row < 0 || column < 0 || row > matrix.length - 1 || column > matrix.length || matrix[row][column] != '0')
            return false;

        boolean result;

        if (flag == 1) {
            result = dfs(matrix, row, column + 1, 1);
        } else {
            result = dfs(matrix, row + 1, column, 0);
        }

        return result;
    }

    public static boolean permutation() {

        int[] array1 = new int[]{1, 2, 3, 6, 5};
        int[] array2 = new int[]{2, 1, 3, 6, 5};

        int add = 0;
        int add2 = 0;
        int mul = 1;
        int mul2 = 1;

        for (int i = 0; i < array2.length; i++) {
            add = add + array1[i];
            add2 = add2 + array2[i];

            mul = mul * array1[i];
            mul2 = mul2 * array2[i];
        }

        return (add == add2) && (mul2 == mul);
    }


    private static int[][] rotateMatrix(int[][] matrix) {

        int[][] newMatrix = new int[matrix.length][matrix.length];

        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = matrix.length - 1; j >= 0; j--) {

                newMatrix[j][counter] = matrix[i][j];
            }
            counter++;
        }

        System.out.println(Arrays.deepToString(newMatrix));
        return null;
    }


    public String mergeAlternately(String word1, String word2) {

        StringBuilder stringBuilder = new StringBuilder();

        int maxLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }

        if (word1.length() != word2.length()) {
            if (word1.length() > word2.length()) {
                for (int i = maxLength; i < word1.length(); i++) {
                    stringBuilder.append(word1.charAt(i));
                }
            } else {
                for (int i = maxLength; i < word2.length(); i++) {
                    stringBuilder.append(word2.charAt(i));
                }
            }
        }

        return String.valueOf(stringBuilder);
    }

    public static String reverseWords(String s) {
        String[] filteredStringArray = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = filteredStringArray.length - 1; i >= 0; i--) {

            sb.append(filteredStringArray[i]);
            if (i != 0) sb.append(" ");
        }

        return String.valueOf(sb);
    }

//    public static List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        Arrays.sort(nums);
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]) {
//                list.add(nums[i]);
//            }
//        }
//        return list;
//    }

    public static List<Integer> findDuplicates(int[] numRay) {
        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length] = numRay[numRay[i] % numRay.length] + numRay.length;
        }

        return l1;
    }


    private static boolean containsVov(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static String getTwoMaxValues(int[] array) {

        if (array == null || array.length == 0) return null;

        if (array.length == 2) return "(" + array[0] + "," + array[1] + ")";

        int max1 = array[0], max2 = array[1];

        for (int counter = 2; counter < array.length; counter++) {

            if (array[counter] > max1 || array[counter] > max2) {
                if (max1 > max2) {
                    max2 = array[counter];
                } else max1 = array[counter];
            }
        }

        return "(" + max1 + "," + max1 + ")";
    }


    public static int[] reverseArray(int[] inputArray) {
        if (inputArray == null || inputArray.length <= 1) return inputArray;

        int reverseCounter = inputArray.length - 1;
        for (int i = 0; i < inputArray.length / 2; i++) {

            int a = inputArray[i];
            inputArray[i] = inputArray[reverseCounter];
            inputArray[reverseCounter] = a;
            reverseCounter--;
        }

        LinkedList<String> linkedList=new LinkedList<>();
//        linkedList.add();
        return inputArray;
    }



}
