package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> ints = new ArrayList<>();

    public void push(int newElement) {
        ints.add(newElement);
    }

    public int size() {
        int listSize;
        listSize = ints.size();
        return listSize;
    }

    public int pop() throws StackTooSmall {
        if (ints.size() == 0) {
            throw new StackTooSmall("Error, empty List");
        }

        int popNumber;
        popNumber = ints.remove(ints.size() - 1);
        return popNumber;
    }

    public int peek() {
        int lastNumber;
        lastNumber = ints.get(ints.size() - 1);
        return lastNumber;
    }

    public int[] pop(int n) {
        int[] nums = new int[ints.size()];
        for (int i = 0; i < n; i++) {
            nums[i] = ints.get(ints.size() - 1);
            ints.remove(ints.size() - 1);
            System.out.println(nums[i] + " removed ");
        }
        return nums;
    }

}
