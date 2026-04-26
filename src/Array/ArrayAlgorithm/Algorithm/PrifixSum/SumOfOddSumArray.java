package Array.ArrayAlgorithm.Algorithm.PrifixSum;
//Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
//
//A subarray is a contiguous subsequence of the array.
//
//
//
//        Example 1:
//
//Input: arr = [1,4,2,5,3]
//Output: 58
public class SumOfOddSumArray
{
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        int total=0;
        int sum =0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            total =(i+1)*(n-i);
            int odd=(total+1)/2;
            sum +=arr[i]*odd;
        }
        System.out.println(sum);
    }
}
