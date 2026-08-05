// print all the unique subsequences of a string

import java.util.HashSet;

public class uniquesubseq {
    // Time complexity -> O(2^n)
    public static void subsequence(String str, int idx , String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.err.println(newString);
                set.add(newString);
                return;
            }
            
        }

        char currChar = str.charAt(idx);

        // to be
        subsequence(str, idx+1, newString+currChar,set);

        // or not to be
        subsequence(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "",set);
        
    }
}