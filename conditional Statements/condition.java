import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even"); //syso it is shortcut for System.out.println();
        }else {
            System.out.println("Odd"); 
        }
        sc.close();
    }    
}
