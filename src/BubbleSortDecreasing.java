import java.util.Scanner;
import java.util.Arrays;

public class BubbleSortDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Decreasing order Bubble Sort
        for (int i = n - 2; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j <= i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
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

