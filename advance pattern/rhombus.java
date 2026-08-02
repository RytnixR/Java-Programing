import java.util.*;

public class rhombus {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        for(int i = 1;i<= r;i++){
            for(int j = 1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        x.close();
    }
    
}
