package Arrays;

// Q:Check if array is sorted.

import java.util.Scanner;

public class arrayPractice6 {
    static boolean isSorted(int[] arr, int n){
        for (int i = 1; i < n ; i++) {
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean ans = isSorted(arr,n);
        if (ans == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
