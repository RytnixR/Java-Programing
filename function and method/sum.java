import java.util.Scanner;

public class sum {
    public static int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 1st number: ");
        int b = sc.nextInt();

        System.out.println("The sum of "+a+ " and "+b+" is: "+add(a,b));

        
    }
}
