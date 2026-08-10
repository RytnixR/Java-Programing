// Place tiles of size 1xm in floor of size nxm
public class tileadjust {
    public static int placetiles(int n , int m){
        if(n == m ){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //vertically
        int vertPlacemnent = placetiles(n-m, m);

        //horizontally
        int horiplacemnent = placetiles(n-1, m);

        return vertPlacemnent + horiplacemnent;
    }
    public static void main(String[] args) {
        int n =4 ,m = 2;
        int k = placetiles(n, m);
        System.out.println(k);
    }
}
