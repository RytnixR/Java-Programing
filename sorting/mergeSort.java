public class mergeSort{
    // Time complexity -> O(n logn)
    public static void conqure(int arr[], int si,int mid ,int ei){
        int merge[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x =0;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid ) {
            merge[x++] = arr[idx1++];
            
        }
        while (idx2 <= ei ) {
            merge[x++] = arr[idx2++];
            
        }
        for (int i = 0, j =si; i < merge.length; i++,j++) {
            arr[j] = merge[i];
            
        }
    }
    public static void Divide(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei -si)/2; //sometime (si + ei)/2 give error due to space so we use alternative
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        conqure(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,5,36,8,4,3};
        int n = arr.length;

        Divide(arr, 0, n-1);
        //print
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}