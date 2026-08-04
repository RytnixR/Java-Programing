public class clearbit {
     public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int NotBitMask = ~(bitMask);

        // step 1 perform operation
        // step 2 perform AND with NOT [mean do NOT operation then AND]

        int newNum = NotBitMask & n;
        System.out.println(newNum);
    }
}
