import java.util.*;

public class switchstatement {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Please enter :-\n1 for English\n2 for Hinglish\n3 for French");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Nameste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Wrong Input");
        }
        sc.close();
    }
    
    
}
