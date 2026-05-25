package Array.ArrayAlgorithm.Algorithm.Questions;
//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//
//There may be duplicates in the original array.
//
//Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
//
//
//
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: true
//Explanation: [1,2,3,4,5] is the original sorted array.
//You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
public class problemno1752
{
    public static boolean proble1752(int []arr){
        int count =0;
        int n = arr.length;
        for(int i =1;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
            if(count>1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(proble1752(arr));
    }

}
