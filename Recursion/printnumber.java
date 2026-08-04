public class printnumber {
    public static void printnum(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n); // decreasing no.
        printnum(n-1);
        System.out.println(n); // increasing no.

    }
    public static void main(String[] args) {
        int n = 5;
        printnum(n);

    }
}
