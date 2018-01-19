package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");

        BinaryHeap<Integer> heap = new BinaryHeap<>() {};

         int elements[] = new int[] {5, 2, 7, 6, 23, 535, 6, 3, 0, -3, 53};
        for (int x: elements) {
            heap.Push(x);
        }

        heap.Print();
        System.out.println("pop " + heap.Pop());
        heap.Print();
        System.out.println("pop " + heap.Pop());
        heap.Print();
    }
}
