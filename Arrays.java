public class Arrays {
    int arr[]; // Declared but not yet initialized

    // This is now a Constructor
    public Arrays(int size) {
        arr = new int[size]; // Memory allocation happens here
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Passing 5 directly to the constructor
        Arrays a = new Arrays(5); 
        a.insert(2, 5);
        a.print();
    }
}
