import java.util.*;

public class new0and1pattern {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter No. of Row :- ");
        int r = x.nextInt();

        for(int i = 1;i<= r;i++){
            for(int j = 1;j<=i;j++){
                if( (j+i)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        
    }
}