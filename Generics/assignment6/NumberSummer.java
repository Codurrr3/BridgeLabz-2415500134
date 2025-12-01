package assignment6;

import java.util.Arrays;
import java.util.List;

public class NumberSummer {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(Arrays.asList(1, 2, 3)));
        System.out.println(sumNumbers(Arrays.asList(1.5, 2.5, 3.0)));
    }
}
