package pattern;

import java.util.*;

public class solidrectangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        System.out.print("Enter No. of Column :- ");
        int C = x.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= C; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        x.close();
    }
}