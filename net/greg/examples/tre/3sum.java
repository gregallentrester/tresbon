package net.greg.examples.tres;

/*
Have the function ThreeSum(arr) take the array of integers stored in arr, and determine if any three distinct numbers (excluding the first element) in the array can sum up to the first element in the array.

For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1].

Your program should return the string true if 3 distinct elements sum to the first element, otherwise your program should return the string false.

The input array will always contain at least 4 elements.

*/

public class OCC {
    public static String ThreeSum(int[] arr) {
        int intVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int tmp = 0;
            for (int x = 2; x < arr.length - 1; x++) {
                int tmpSum = arr[i] + arr[x] + arr[x+1];
                if (arr[i] + arr[x] + arr[x + 1] == intVal) {
                    System.out.println("DEBUG"+ intVal+ "::"+ tmpSum);
                    return "true";
                }
            }
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print("Test 1 passing: " + (ThreeSum(new int[] {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2}) == "true") + "\r\n");
        System.out.print("Test 2 passing: " + (ThreeSum(new int[] {12, 3, 1, -5, -4, 7}) == "false") + "\r\n");
    }
}
#########################################################
