package Arrays;

//Find sum of elements given in an array

public class arrayPractice2 {
    static  int sum(int []arr){
        int sum = 0; //initializing sum
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
            return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
        System.out.println("Sum of given array is: " + sum(arr));
    }

}
