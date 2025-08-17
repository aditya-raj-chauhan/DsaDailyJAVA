import java.util.LinkedList;

public class Day3Collections {
    public static void main(String[] args) {
        
        // 1. Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // 2. Add elements
        fruits.add("Banana");        // end
        fruits.addFirst("Apple");    // head
        fruits.addLast("Cherry");    // tail
        fruits.add(1, "Mango");      // at index

        // 3. Access elements
        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());
        System.out.println("Index 2: " + fruits.get(2));

        // 4. Remove elements
        fruits.removeFirst();        // removes Apple
        fruits.removeLast();         // removes Cherry
        fruits.remove(1);            // removes element at index 1

        // 5. Iterate
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
