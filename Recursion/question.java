// question 1 -> print x^n (stack height = n)

// public class question {
//     public static int pow(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }
//         int xpownm1 = pow(x, n-1);
//         int xpow = x * xpownm1;
//         return xpow;

//     }
//     public static void main(String[] args) {
//         int n = 2, x = 7;
//         int ans = pow(x, n);
//         System.out.println(ans);
        
        
//     }
// }

// Question 2 -> print x^n (stack height = log n)

public class question {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2 == 0){
            return pow(x, n/2) * pow(x, n/2);
        }
        else{
            return pow(x, n/2) * pow(x, n/2) * x;
        }

    }
    public static void main(String[] args) {
        int n = 2, x = 7;
        int ans = pow(x, n);
        System.out.println(ans);
        
        
    }
}