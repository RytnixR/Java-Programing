import java.util.Scanner;

public class basics {
    public static void printName(String name) {
        System.out.println("Your name is "+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        printName(name);
    }
}
