    
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first line: total number of elements
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Read the second line: the sequence of numbers
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int current = sc.nextInt();

                if (current > largest) {
                    // Update second largest before updating largest
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current < largest) {
                    // Update second largest if current is in between
                    secondLargest = current;
                }
            }
        }

        // Print only the final result
        System.out.println(secondLargest);
        
        sc.close();
    }
}