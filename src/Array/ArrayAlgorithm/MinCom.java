package Array.ArrayAlgorithm;

public class MinCom
{
    static int minCom(int []nums1,int []nums2){
        int min=-1;
        int l =0;
        int r =0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]==nums2[r]){
                min =nums1[l];
                break;
            }
            else if(nums1[l]<nums2[r]){
                l++;
            }
            else if(nums2[r]<nums1[l]){
                r++;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,6};
        int nums2[]={2,3,4,5};
        int res =minCom(nums1,nums2);
        System.out.println(res);
    }
}
