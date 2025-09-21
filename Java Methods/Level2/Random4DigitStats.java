/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 
*/
public class Random4DigitStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
        double[] stats = findAverageMinMax(arr);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);
    }
}
