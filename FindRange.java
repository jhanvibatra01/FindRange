package com.tw;

import java.util.Scanner;

public class FindRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] < minVal)
                minVal = arr[i];
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }

        System.out.println(maxVal - minVal);
    }
}
