package com.company;

import java.util.ArrayList;

public class BinaryHeap <T extends Comparable> {
    private ArrayList<T> _list;

    public BinaryHeap() {
        _list = new ArrayList<>();
    }

    public void Push(T element) {
        _list.add(element);
        balance(_list.size() - 1);
    }

    private void balance (int index) {
        while (index > 0) {
            int root = (index - 1) / 2;
            if (_list.get(root).compareTo(_list.get(index)) < 0) {
               swap(root, index);
               index = root;
            }
            else
                break;
        }
    }

    private void swap (int a, int b) {
        T t = _list.get(a);
        _list.set(a, _list.get(b));
        _list.set(b, t);
    }

    public void Print () {
        for (T x: _list) {
           System.out.print(x + " ");
        }
        System.out.println();
    }

    public T Pop() {
        T element = _list.get(0);
        _list.remove(0);
        ArrayList<T> list = (ArrayList<T>) _list.clone();
        _list.clear();
        for (T elem: list) {
            Push(elem);
        }

        return element;
    }

    public T Top() {
        return _list.get(0);
    }

    public boolean isEmpty () {
        return _list.isEmpty();
    }

    public int size() {
        return _list.size();
    }
}
