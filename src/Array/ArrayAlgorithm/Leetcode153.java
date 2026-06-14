package Array.ArrayAlgorithm;

public class Leetcode153
{
    static int function(int []arr){
        int l =0;
        int r =arr.length-1;
        while(l<r){
            int mid =l+(r-l)/2;
            if(arr[mid]<arr[r]){
                r = mid;
            }
            else{
                l= mid+1;
            }
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(function(arr));

    }
}
