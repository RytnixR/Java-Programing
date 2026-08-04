// rules :-
//      1 -> Only one disk transferred at 1 step
//      2 -> Smaller disk are always kept on top of larger disks

public class towerOfHanoi {  // time complexity -> O(2^n - 1) => O(2^n)
    public static void stepCalc(int n, String src, String helper , String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
            return;
        }

        stepCalc(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
        stepCalc(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        stepCalc(n, "S", "H", "D");
    }
}