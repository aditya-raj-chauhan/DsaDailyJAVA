public class TimeComplexityDay2Dsa {

    // Example 1: Iterative sum of array
    // TC = O(n), SC = O(1) auxiliary (just variables)
    public static int iterativeSum(int[] arr) {
        int sum = 0;  // O(1) space
        for (int i = 0; i < arr.length; i++) { // O(n) time
            sum += arr[i];
        }
        return sum;
    }

    // Example 2: Recursive factorial
    // TC = O(n), SC = O(n) auxiliary (recursion stack)
    public static int recursiveFactorial(int n) {
        if (n == 0) return 1;   // Base case, O(1)
        return n * recursiveFactorial(n - 1); // Recursive call → O(n)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Demonstrate iterative sum
        int sum = iterativeSum(arr);
        System.out.println("Sum (Iterative): " + sum);

        // Demonstrate recursive factorial
        int n = 5;
        int fact = recursiveFactorial(n);
        System.out.println("Factorial (Recursive): " + fact);

        // Key Observations
        System.out.println("\n--- Complexity Analysis ---");
        System.out.println("Iterative Sum → Time: O(n), Space: O(1)");
        System.out.println("Recursive Factorial → Time: O(n), Space: O(n)");
    }
}
