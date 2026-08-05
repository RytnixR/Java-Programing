// Move all 'x' to the end of the string

public class xInEnd {
    //Time complexity -> O(n)
    public static int count = 0;

    public static void movex(StringBuilder k,int idx,int n, char a){

        
        if(k.charAt(idx) != a){
            k.setCharAt(count, k.charAt(idx));
            count++;
        }
        if (idx == n) {
            while(count<=n){
                k.setCharAt(count, 'x');
                count++;
            }
            return;
        }
        movex(k, idx+1, n, a);
    }
    public static void main(String arg[]){
        StringBuilder str = new StringBuilder("axmxsxxd");

        movex(str, 0, str.length()-1, 'x');
        System.out.println(str);
    }
}