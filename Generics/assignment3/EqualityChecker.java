package assignment3;

public class EqualityChecker {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) {
            return b == null;
        }
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));
        System.out.println(isEqual("hi", "hello"));
    }
}
