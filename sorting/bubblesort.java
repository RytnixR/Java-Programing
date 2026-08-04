
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of element you wanted: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of "+i+" index : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array is created that is -> {");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(",");
            }
        }
        System.out.println("}");

        // Bubble sorting
        // time complexity = O(n^2)

        int j = 0;
        while (j < n-1) {
            int i = 0;
            while (i < n-1-j) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                
                }
                i++;
            }
            j++;
            
        }

        System.out.print("Your Sorted array is created that is -> {");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(",");
            }
        }
        System.out.print("}");

    }
}