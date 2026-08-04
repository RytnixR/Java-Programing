public class setbit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
        // step 1 perform operation
        // step 2 perform bitwise OR

        int newNum = bitMask | n;
        System.out.println(newNum);
    }
}
