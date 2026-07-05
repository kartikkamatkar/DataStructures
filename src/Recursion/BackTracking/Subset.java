package Recursion.BackTracking;


import java.util.ArrayList;
import java.util.List;


public class Subset
{
    public static List<List<Integer>> subsets(int[] nums)
    {
        //create the Answer List
        List<List<Integer>> ans = new ArrayList<>();
        //called the function
        backtrack(ans ,new ArrayList<>(),nums,0);
        //return answer
        return ans;
    }
    public static void backtrack(List<List<Integer>>ans,List<Integer>curr,int []nums,int index){
        //base case
        if(index== nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //choice
        //add the current the index first
        curr.add(nums[index]);
        //called for next index
        backtrack(ans,curr,nums,index+1);
        //undo
        //backtrack the list and called for the nest index
        curr.remove(curr.size()-1);
        backtrack(ans,curr,nums,index+1);



    }
    public static void main(String[] args) {
        //Given Integer List
        int[] nums = {1, 2, 3};

        //carry the result
        List<List<Integer>> result = subsets(nums);
        //print the result
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
