/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/
import java.util.HashSet;
public class UniqueOTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static boolean areUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.size() == arr.length;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.print("OTPs: ");
        for (int n : otps) System.out.print(n + " ");
        System.out.println();
        System.out.println("All OTPs unique? " + areUnique(otps));
    }
}
