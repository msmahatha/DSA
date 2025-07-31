import java.util.Scanner;
import java.util.Arrays;

public class BubbleSortFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort from end (descending order)
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array in decreasing order:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
