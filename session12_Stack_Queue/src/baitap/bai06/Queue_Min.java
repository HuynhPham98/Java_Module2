package baitap.bai06;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Min {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 19, 5, 9, 2, 6, 8, 12, 5};
        int min = findMinElement(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng: " +min);
    }

    private static int findMinElement(int[] arr) {
        Queue<Integer> minQueue = new LinkedList<Integer>();
        for(int num : arr) {
            minQueue.add(num);
        }
        int minEle = minQueue.poll();
        int size = minQueue.size();
        for (int i = 0; i < size; i++) {
            int current = minQueue.poll();
            if(minEle > current) {
                minQueue.offer(minEle);
                minEle = current;
            } else {
                minQueue.offer(current);
            }
        }
        return minEle;
    }
}
