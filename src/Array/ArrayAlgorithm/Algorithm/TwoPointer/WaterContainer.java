package Array.ArrayAlgorithm.Algorithm.TwoPointer;
//Problem Statement:
//
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the iᵗʰ line are (i,0) and (i,height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Example:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Best Approach:
//
//Use Two Pointers:
//
//One pointer at left
//One pointer at right
//Calculate area
//Move smaller height pointer inward
public class WaterContainer
{
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int l =0,r=height.length-1;
        int sum=0;
        while(l<r){
            int currentsum = Math.min(height[l],height[r]) * (r-l);
            sum = Math.max(currentsum,sum);
            if(height[l] < height[r])
                l++;
            else
                r--;

        }
        System.out.println(sum);
    }
}
