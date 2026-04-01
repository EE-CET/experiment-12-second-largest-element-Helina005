    
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int current = sc.nextInt();

                // Changed to >= to handle duplicate largest values
                if (current >= largest) {
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest) {
                    secondLargest = current;
                }
            }
        }

        System.out.println(secondLargest);
        
        sc.close();
    }
}