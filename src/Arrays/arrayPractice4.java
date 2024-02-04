package Arrays;

public class arrayPractice4 {
    static int average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        int[] arr = {30, 50, 100, 200};
        System.out.println("The average is: " + average(arr) );
    }
}
