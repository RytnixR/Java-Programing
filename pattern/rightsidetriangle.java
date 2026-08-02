import java.util.Scanner;

public class rightsidetriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        for(int i = r;i>= 1;i--){
            // space printing
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            // star printing
            for(int k = 1; k<=(r-(i-1));k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}