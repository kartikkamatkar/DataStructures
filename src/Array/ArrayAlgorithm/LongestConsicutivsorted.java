package Array.ArrayAlgorithm;

public class LongestConsicutivsorted
{
    public static int findLongestConsicutive(int []arr){
        int maxstreak=1;
        int currstreack=1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                currstreack++;
            }
            else {
                currstreack=1;
            }
            maxstreak=Math.max(currstreack,maxstreak);
        }
        return maxstreak;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,7};
        System.out.println(findLongestConsicutive(arr));
    }
}
