import java.util.*;

public class question {
    public static void main(String[] args) {
        System.out.println("Enter a no to Find sum of first natural no. :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 2; i <= n ; i++) {
            sum += i;
        }
        System.out.println("Sum of First "+n+" natural number is "+sum);
        sc.close();
    }
    
}
