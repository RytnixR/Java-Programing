public class reversestring {
    // time complexity -> O(n)
    public static void printrev(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printrev(str, idx-1);

    }
    public static void main(String[] args) {
        String str = "abcde";
        printrev(str, str.length()-1);
    }
}