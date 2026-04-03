package pattern;

import java.util.*;

public class hollow_rectangle {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = sc.nextInt();

        System.out.print("Enter No. of Column :- ");
        int C = sc.nextInt();

        for (int i = 0 ; i<r;i++) {
            for (int j = 0; j < C; j++) {
                if(i==0 || i == (r-1) || j == 0 || j == (C-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
