import java.util.*;

public class switchstatement {
    public static void main(String[] args) {
        System.out.println("Please enter :-\n1 for English\n2 for Hinglish\n3 for French");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1: 
            System.out.println("Hello");
                    break;
            case 2:
            System.out.println("Nameste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
    
    
}
