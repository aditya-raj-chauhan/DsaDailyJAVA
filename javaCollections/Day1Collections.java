import java.util.*;  // Collection, ArrayList, Iterator

public class Day1Collections {
    public static void main(String[] args) {
        // Using Collection interface with ArrayList implementation
        Collection<String> names = new ArrayList<>();

        // Adding elements to the collection
        names.add("Aditya");
        names.add("Devotee");
        names.add("Coder");

        // Checking size of collection
        System.out.println("Size of collection: " + names.size());

        // Checking presence of an element
        if (names.contains("Devotee")) {
            System.out.println("Devotee is present in the collection.");
        }

        // Removing an element
        names.remove("Coder");

        // Iterating using for-each loop (enabled by Iterable interface)
        System.out.println("\nIterating using for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterating using Iterator explicitly
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
