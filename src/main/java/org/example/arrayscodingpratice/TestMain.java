package org.example.arrayscodingpratice;

import java.util.Scanner;

public class TestMain {

    // Method to find the minimum element in the array
    public static int findMin(int[] arr) {
        int n = arr.length;
        int minElement = Integer.MAX_VALUE; // Initialize with the maximum possible value

        // Loop through the array to find the minimum element
        for (int i = 0; i < n; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the size of the array
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[n];

        // Prompt the user to enter array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the minimum value in the array
        System.out.println("Minimum value is: " + findMin(arr));

    }




}
