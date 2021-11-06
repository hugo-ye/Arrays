package com.company;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void homework1() {
        int sum = 0;
        int[] list = {1, 2, 3, 4, 5};
        System.out.print("array: ");
        for (int i : list) {
            System.out.printf("%d ", i);
            sum += i;

        }
        System.out.printf("\nsum: %d", sum);
    }

    public static void homework3() {
        int[] values = {-3, 2, 5, 4, 7};
        boolean result = true;
        int n = 1;
        while (result && n < 5) {
            if (values[n] < values[n - 1]) {
                result = false;
            }
            n += 1;
        }
        System.out.print(result);
    }

    public static void homework4() {
        int[] list = {1, 2, 3, 4, 5};
        System.out.print("original: ");
        for (int i : list) {
            System.out.printf("%d ", i);
        }
        System.out.print("\nreversed: ");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.printf("%d ", list[i]);
        }
    }


    public static void homework5() {
        int[] original = {1, 2, 3, 4, 5};
        int[] cumulative = new int[original.length];
        int sum = 0;
        System.out.print("original array: ");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%d ", original[i]);
            sum += original[i];
            cumulative[i] = sum;
        }
        System.out.print("\ncumulative sum: ");
        for (int i : cumulative) {
            System.out.printf("%d ", i);
        }
    }

    public static void homework6() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int m = 3;
        int[] newList = new int[array.length];
        int smallerIndex = 0;
        int biggerIndex = array.length - 1;

        System.out.print("array: ");

        for (int i : array) {
            System.out.printf("%d ", i);
            if (i < m) {
                newList[smallerIndex] = i;
                smallerIndex += 1;
            }
            if (i > m) {
                newList[biggerIndex] = i;
                biggerIndex -= 1;
            }
        }
        System.out.printf("\nm: %d\n", m);
        System.out.print("smaller: ");
        for (int i = 0; i < smallerIndex; i++) {
            System.out.printf("%d ", newList[i]);
        }
        System.out.println("");

        System.out.print("bigger: ");
        for (int i = newList.length - 1; i > biggerIndex; i--) {
            System.out.printf("%d ", newList[i]);
        }
    }


}