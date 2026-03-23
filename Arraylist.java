import java.util.ArrayList; 
import java.util.Arrays;    // Added for Arrays.asList
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        // 1. Create - Need to import java.util.ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        
        // 2. Add
        cars.add("volvo");
        cars.add("bmw");
        
        // 3. Set
        cars.set(0, "audi");

        
        for (String i : cars) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Clear
        cars.clear();
        for (String i : cars) { // Fixed type here too
            System.out.print(i + " ");
        }
        System.out.println();

        // 5. Arrays.asList 
        // var color = new ArrayList<Integer>(Arrays.asList(1, 5, 2, 3, 4));
          ArrayList<Integer> color = new ArrayList<Integer>(Arrays.asList(1, 5, 2, 3, 4));
        for (int i : color) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 6. Get
        System.out.println("Value at index 1: " + color.get(1));
        
        // 7. Remove
        color.remove(2); // Removes the element at index 2
        for (int i : color) {
            System.out.print(i + " "); // Fixed: print 'i', not the whole list 'color'
        }
        System.out.println();
        System.out.println("Size: " + color.size());

        // 8. Sort
        
        Collections.sort(color);
        System.out.println("Sorted: " + color);

        // 9. Reverse Sort
        Collections.sort(color, Collections.reverseOrder());
        System.out.println("Reverse Sorted: " + color);
    }
}
