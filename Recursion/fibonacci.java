public class fibonacci {
    public static void fact(int n, int a ,int b){
        if(n==0){
            return;
        }
        
        int c = a+b;
        System.out.println(c);
        fact(n-1, b, c);

    }
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fact(n-2,0,1);
        
    }
}