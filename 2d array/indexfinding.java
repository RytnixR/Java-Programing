
import java.util.Scanner;

public class indexfinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of row in your 2array: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of column in your 2array: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        // input

        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter vlaue of arr["+i+"]["+j+"] in your 2array: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // output

        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        // finding index

        System.out.print("Enter value of which index you want to find: ");
        int k = sc.nextInt();

        int m = -1 ,n = -1;
        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==k){
                    m = i;
                    n = j;
                    break;
                }
            }
        }
        if(n>=0){
            System.out.print(k+" value is present at arr["+m+"]["+n+"] index of 2array");
        }
        else{
            System.out.println("Invalid value ...!");
        }
    }
}