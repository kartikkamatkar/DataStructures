package Array.ArrayAlgorithm;

import java.util.HashSet;

public class RepetedTimes
{
    public static int repeatedNTimes(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int num :nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[]={1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }
}
