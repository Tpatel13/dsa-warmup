package Queue;

import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);

//        queueArray.enQueue(1);
//        queueArray.enQueue(2);
//        queueArray.enQueue(3);
//        queueArray.enQueue(4);
//        System.out.println(queueArray.deQueue());
//        CircularQueue circularQueue = new CircularQueue(3);
//        System.out.println(circularQueue.isEmpty());
//        System.out.println(circularQueue.isFull());

//        QueueLinkedList linkedList = new QueueLinkedList();
//
//        linkedList.enQueue(1);
//        linkedList.enQueue(2);
//        linkedList.enQueue(3);
//
//        System.out.println(linkedList.deQueue());
//        System.out.println(linkedList.deQueue());
//        System.out.println(linkedList.deQueue());
//        System.out.println(linkedList.deQueue());
//        Queue<String> queue = new LinkedList<>();
//
//
//        Deque<Integer> integersQueue = new ArrayDeque<>();

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);

        System.out.println(map.get(1));

        System.out.println(map.getOrDefault(1, 10));
        System.out.println(map.get(1));

        HashMap<String,String> stringStirngHashMap=new HashMap<String, String>();
    }
}
