import java.util.*;

public class lefttriangle {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        for(int i = 1;i<= r;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}