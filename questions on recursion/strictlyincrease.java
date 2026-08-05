//Find if the array is strictly increasing

public class strictlyincrease {
    // Time complexity -> O(n)
    public static boolean compare(int idx, int n,int arr[]){
        if(n==idx){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return compare(idx+1, n, arr);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        
        System.out.println(compare(0, arr.length-1, arr));
    }
}