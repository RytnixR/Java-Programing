
import java.util.Scanner;


public class decreasinglefttriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        for(int i = r;i>= 1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}