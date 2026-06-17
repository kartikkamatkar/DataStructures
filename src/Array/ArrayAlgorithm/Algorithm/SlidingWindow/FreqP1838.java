package Array.ArrayAlgorithm.Algorithm.SlidingWindow;

import java.util.Arrays;


public class FreqP1838 {
    public static int maxFrequency(int[] nums, int k) {
   Arrays.sort(nums);
        long sum = 0;
        int left = 0;
        int ans = 1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4};
        int t=4;
        System.out.println(maxFrequency(arr,t));
    }
}
