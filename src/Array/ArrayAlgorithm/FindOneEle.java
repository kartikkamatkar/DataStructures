package Array.ArrayAlgorithm;

public class FindOneEle {
    public static void main(String[] args) {
        int nums[]={4,1,1,2,2,4,5};
        int ans =0;
        for(int i =0;i< nums.length;i++){
            ans^=nums[i];
        }
        System.out.println(ans);
    }
}
