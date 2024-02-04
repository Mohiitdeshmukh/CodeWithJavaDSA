package Arrays;

// Q:Find maximum in an array

public class arraypractice3 {
    static int largest(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if( max < arr[i])
                max = arr[i];
                return max;
            
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("The maximum number among these is: " + largest(arr));
    }
}
