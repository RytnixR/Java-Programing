import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();//next() is used for one word whereas nextLine() used for whole sentence
        //nextInt()  for input integer
        //nextFloat() for input float
        System.out.println("You Entered -> "+Name);
        sc.close();
    }
    
}
