package com.metanit;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayUtils.printArray(arr);
        int length = arr.length;
        int temp;
        for (int a = 0; a < length / 2; a++) {
            temp = arr[length - a - 1];
            arr[length - a - 1] = arr[a];
            arr[a] = temp;

        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a]);
        }
    }
}
