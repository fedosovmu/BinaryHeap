package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");

        BinaryHeap<Integer> heap = new BinaryHeap<>() {};

        int elements[] = new int[] {5, 2, 5, 6, 23, 535, 6, 3, 0, -3, 53};
        for (int x: elements) {
            heap.Push(x);
        }

        System.out.println(heap.Pop() + " " + heap.Pop());
    }
}
