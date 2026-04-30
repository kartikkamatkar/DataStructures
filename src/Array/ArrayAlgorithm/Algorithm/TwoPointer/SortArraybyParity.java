package Array.ArrayAlgorithm.Algorithm.TwoPointer;
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//        Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
public class SortArraybyParity
{
    public static void main(String[] args) {
        int nums[]={4,2,3,1};
        int l =0;
        int r = nums.length-1;
        while(l<r){
            if(nums[l]%2==0){
                l++;
            }
            else if(r%2!=0){
                r--;
            }
            else{
                int temp =nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
        }
        for(int i =0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
}
