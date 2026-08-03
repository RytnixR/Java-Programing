
public class basics {
    public static void main(String args[]) {
        int[] marks = new int[3]; //another way to write/initilize -> int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 88;
        marks[2] = 94;

        //another way to write/declaration -> int marks[] = {97, 88, 94};


        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // using loops
        for (int i = 0; i <3; i++) {
            System.out.println(marks[i]);
        }

    }
}