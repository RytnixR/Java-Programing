
import java.util.Scanner;

public class stringmanuplation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //concatenation
        String firstName = "Rajeev";
        String lastName = "khanduri";

        String FullName = firstName + "@" +lastName;

        System.out.println(FullName);

        // length function
        System.out.println(FullName.length());

        // charAt print individual character from string

        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(i+1 + " -> "+FullName.charAt(i));
        }


        //compare
        String name1 = "Rytnix";
        String name2 = "Rytnix";

        //1 s1 > s2 : postive value
        //2 s1 < s2 : -ive value
        //3 s1 == s2 : 0

        if(name1.compareTo(name2)==0) {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }

        // build up for string builder

        if(new String("raka")== new String("raka"))  {
            System.out.println("Strings are Equal");
        }
        else System.out.println("Strings are not Equal");

        // substring
        String sentence = "Your can do whatever You want to do....!";
        String name3 = sentence.substring(11, sentence.length());
        System.out.println(name3);

        //strings are immutable...

    }
}