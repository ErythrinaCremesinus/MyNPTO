public class Main {

    int c = 0;

    public static void main(String[] args) {
        System.out.println("Starting memory test...");

        // Allocate memory in a loop
        for (int i = 0; i < 10000; i++) {
            int[] largeArray = new int[1_000_000]; // Allocate ~4MB per iteration
            largeArray[0] = i; // Prevent optimization
            System.out.println("Iteration " + i + ": Allocated 4MB");
        }

        System.out.println("Memory test complete.");
    }
}