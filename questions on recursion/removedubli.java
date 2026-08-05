// remove dublicate in string

public class removedubli{
    // Time complexity -> O(n)
    public static boolean[] map = new boolean[26];

    public static void removeDublicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            removeDublicates(str, idx+1, newString);
        }
        else{
            newString += currchar;
            map[currchar - 'a'] = true;
            removeDublicates(str, idx+1, newString);

        }
    }
    public static void main(String[] args) {
        String str = "aabbcddekspddja";
        removeDublicates(str, 0, "");
    }
}