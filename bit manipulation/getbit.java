public class getbit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        // step 1 perform operation
        // step 2 perform bitwise AND

        if((bitMask & n) ==0 ) {
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}