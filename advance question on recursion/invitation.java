// Find the number of ways in which you can invite n people to your party, single or in pairs

public class invitation {
    public static int callGuest(int n){
        if(n <= 1){
            return 1;
        }

        //single
        int ways1 = callGuest(n-1);

        //pairs
        int ways2 = (n-1) * callGuest(n-2);

        return ways1 +ways2;
    }

    public static void main(String arg[]){
        int n = 4;
        int k = callGuest(n);
        System.out.println(k);
    }
}
