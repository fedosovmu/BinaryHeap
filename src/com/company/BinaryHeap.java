package com.company;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap <T extends Comparable<T>> {
    private List<T> _list;

    public BinaryHeap() {
        _list = new ArrayList<>();
    }

    public void Push(T element) {
        _list.add(element);
    }

    private void balance (int index) {
        if (index != 0) {
            int root = (index - 1) / 2;

        }
    }

    public T Pop() {
        return _list.remove(0);
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
