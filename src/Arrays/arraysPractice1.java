package Arrays;

//Iteration of arrays

public class arraysPractice1 {
    public static void main(String[] args) {
        //Declaring variable
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0 , sumSq = 0;
        double mean, stdDev;

        //Computing sum and square-sum using loop
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sumSq += numbers[i] * numbers[i];
        }

        mean = (double) sum / numbers.length;
        stdDev = Math.sqrt((double) sumSq / numbers.length - mean * mean);

        System.out.println("Mean is: " + mean);
        System.out.println("Standard deviation is: " + stdDev);
    }
}

