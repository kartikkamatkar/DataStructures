package Recursion.BackTracking;

import java.util.ArrayList;


public class SubArray
{
    public static void printSubArray(int arr [],ArrayList<Integer>nums,int i )
    {
       if(i ==arr.length){
           System.out.println(nums);
           return;
       }
       nums.add(arr[i]);
       printSubArray(arr,nums,i+1);
       nums.remove(nums.size()-1);
       printSubArray(arr,nums,i+1);

    }
    public static void main(String[] args) {
        int arr []={7,1,3,4,6,5};
        ArrayList<Integer> nums =new ArrayList<>();
        printSubArray(arr,nums,0);
    }
}
