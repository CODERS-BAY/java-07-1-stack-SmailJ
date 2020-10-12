package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws StackTooSmall {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int temp;

        System.out.println("1 = new number, 2 = list size, 3 = last number & delete it, 4 = last number, 5 = delete some last numbers");
        int choose = sc.nextInt();
        do {
            if (choose == 1) {
                System.out.println("Enter the number");
                temp = sc.nextInt();
                stack.push(temp);
            } else if (choose == 2) {
                System.out.println(stack.size());
            } else if (choose == 3) {
                System.out.println("The last number was " + stack.peek() + " and was deleted.");
                stack.pop();
            } else if (choose == 4) {
                System.out.println(stack.peek());
            } else if (choose == 5) {
                System.out.println("How much you want to remove");
                temp = sc.nextInt();
                stack.pop(temp);
            } else {
                System.out.println("Incorrect");
            }

            System.out.println("1 = new number, 2 = list size, 3 = last number & delete it, 4 = last number, 5 = delete some last numbers");
            choose = sc.nextInt();

        } while (!sc.equals("q"));
    }

}
