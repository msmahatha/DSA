import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "numbers:");

        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();

        }
        //Bubble shot
        for(int i=n-2;i>=0;i--){
            boolean swapped = false;
            for(int j=0; j<=i;j++){
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;


                }

            }
            if(!swapped) break;

        }
        System.out.println("sorted array");
//        for(int num : arr){
//            System.out.println(num+ " ");
//        }
        System.out.println(Arrays.toString(arr));
        sc.close();



    }
}
