import java.util.Scanner;

public class selectionsort {
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

        // Selection sorting
        // time complexity = O(n^2)

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[smallest] > arr[j]) {
                    smallest = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
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
