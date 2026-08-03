
import java.util.Scanner;

public class indexfinding {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of element you wanted in your array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of "+i+" index : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is created ...!");

        System.out.print("Enter value of which index you want to find: ");
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n ; i++) {
            // length function use  for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==k){
                count = i;
                break;
            }
        }
        
        if(count>0){
            System.out.print(k+" value is present at "+count+" index of array");
        }
        else{
            System.out.println("Invalid value ...!");
        }
    
    }


}