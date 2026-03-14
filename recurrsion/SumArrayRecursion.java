public class SumArrayRecursion {

    static int sum(int arr[], int n) {
        // Base case
        if (n == 0)
            return 0;

        // Recursive case
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int n = arr.length;

        int result = sum(arr, n);
        System.out.println("Sum = " + result);
    }
}
