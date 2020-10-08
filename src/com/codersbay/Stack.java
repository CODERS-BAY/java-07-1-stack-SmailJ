package com.codersbay;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {

    List<Integer> ints = new ArrayList<>();
    int listSize;
    int lastNumber;

    public void push(int newElement) {
        ints.add(newElement);
    }

    public int size() {
        listSize = ints.size();
        return listSize;
    }

    public int pop() {
        if (ints.size() == 0) {
            throw new EmptyStackException();
        }
        ints.remove(ints.size() - 1);
        return 0;
    }

    public int peek() {
        if (ints.size() == 0) {
            throw new EmptyStackException();
        }
        lastNumber = ints.get(ints.size() - 1);
        return lastNumber;
    }

    public int[] pop(int n) {
        if (ints.size() == 0) {
            throw new EmptyStackException();
        }
        int[] nums = new int[ints.size()];
        for (int i = 0; i < n; i++) {
            nums[i] = ints.get(ints.size() -1);
            ints.remove(ints.size() - 1);
            System.out.print(nums[i] + " removed ");
        }
        return nums;
    }

}
