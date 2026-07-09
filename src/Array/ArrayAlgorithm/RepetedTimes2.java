package Array.ArrayAlgorithm;
//brute Force Approach
import java.util.Arrays;

public class RepetedTimes2
{
    public static int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++) {
        if(nums[i]==nums[i-1]){
            return nums[i];
        }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));

    }
}
