package Arrays;

import java.util.*;

public class SumOfNumbers {
    public static void sumOfNumbersInArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The Sum of elements in the array :" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfNumbersInArray(arr);
        sc.close();

    }

}
