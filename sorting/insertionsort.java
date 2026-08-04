import java.util.Scanner;

public class insertionsort {
    
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

        // Insertion sorting
        // time complexity = O(n^2)

        for(int i = 1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
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
