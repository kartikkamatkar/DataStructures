package Array.ArrayAlgorithm.Algorithm.Kadanes;
//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
//
//A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
//
//A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
//
//
//
//        Example 1:
//
//Input: nums = [1,-2,3,-2]
//Output: 3
//Explanation: Subarray [3] has maximum sum 3.
//Example 2:
//
//Input: nums = [5,-3,5]
//Output: 10
//Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

public class Problem918
{
    public static int kedanes(int [] arr){
        int total=0,max=arr[0],min=arr[0],currentmin=0,currentmax=0;
        for(int num:arr){
            currentmax=Math.max(num,currentmax+num);
            max=Math.max(max,currentmax);
            currentmin=Math.min(num,currentmin+num);
            min=Math.min(currentmin,min);
            total+=num;
        }
        return max<0?max:Math.max(max,total-min);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -2};
        int res =kedanes(arr);
        System.out.print(res);
    }
}
