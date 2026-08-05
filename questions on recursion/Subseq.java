// print all the subsequences of a string
public class Subseq {
    // Time complexity -> O(2^n)
    public static void subsequence(String str, int idx , String newString){
        if(idx == str.length()){
            System.err.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // to be
        subsequence(str, idx+1, newString+currChar);

        // or not to be
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
        
    }
}