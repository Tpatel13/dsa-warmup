package list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedListLeetCodeMain {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        stringToInt("abc123");
    }

    public ListNode reverseNode(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Stack<String> stringStack = new Stack<>();

        stringStack.capacity();
//        stringStack.
        return null;
    }


    public static int stringToInt(String inputString) {

        char[] array = inputString.toCharArray();

        int filteredValue = 0;

        StringBuilder stringBuilder = new StringBuilder();

        boolean isPositive = true;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value >= 48 && value <= 57) {
                stringBuilder.append(array[i]);
            }
            if (value == 45) {
                isPositive = !isPositive;
            }
        }

        filteredValue = Integer.parseInt(String.valueOf(stringBuilder));

        if (!isPositive) {
            filteredValue = -filteredValue;
        }
        return filteredValue;
    }

}
