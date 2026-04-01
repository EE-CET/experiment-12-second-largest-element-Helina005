    
  import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        // Find largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find second largest (distinct)
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        } else {
            System.out.println(secondMax);
        }
    }
}