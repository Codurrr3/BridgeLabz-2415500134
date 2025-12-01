package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCopier {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.clear();
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> target = new ArrayList<>();
        List<Integer> source = Arrays.asList(1, 2, 3);
        copyList(target, source);
        System.out.println(target);
    }
}
