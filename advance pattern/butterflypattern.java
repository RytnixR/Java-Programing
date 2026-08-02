import java.util.Scanner;

public class butterflypattern {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter no of row: ");
        int r = a.nextInt();


        //upper side

        for(int i = 1;i<= r;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            // for space
            for(int m=1;m<2*(r-i);m++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");

        }
         //lower side
        for(int i = r;i>= 1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            // for space
            for(int m=1;m<2*(r-i);m++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        a.close();
    }
    
}
