package assignment1;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        Box<Double> dblBox = new Box<>();
        dblBox.set(5.5);
        System.out.println(intBox.get());
        System.out.println(strBox.get());
        System.out.println(dblBox.get());
    }
}
