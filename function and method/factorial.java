import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        if(a<0){
            System.out.println("Invalid no.");
            return 0;
        }
        if(a==1 || a==0){
            return 1;
        }
        else{
            return fact(a-1) * a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial: ");
        int a = sc.nextInt();

        if(fact(a)!=0){
        
            System.out.println("The factorial of "+a+" is: "+fact(a));
        }

        
    }
}
