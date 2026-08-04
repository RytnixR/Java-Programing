public class updatebit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int NotBitMask = ~(bitMask);

        // step 1 perform operation
        // step 2
        // (a) to make  1 to 0 perform clear bit operation -> perform AND with NOT [mean do NOT operation then AND]
        // (b) to make 0 to 1 perform set bit operation -> perform bitwise OR

        int newNum = NotBitMask & n;
        System.out.println(newNum);

        pos = 1;
        bitMask = 1<<pos;
        
        newNum = bitMask | newNum;
        System.out.println(newNum);
    }
}
