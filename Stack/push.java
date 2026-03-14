//package stackkkkk;
class Stack {

    int[] arr = new int[10];
    int top = -1;
    int capacity = 10;

    void push(int value) {

        if(top + 1 >= capacity * 0.75) {

            int newCapacity = capacity + 1;

            int[] newArr = new int[newCapacity];

            for(int i = 0; i <= top; i++) {
                newArr[i] = arr[i];
            }

             arr = newArr;
        capacity = newCapacity;
    }
    top++;
    arr[top] = value;
}
}