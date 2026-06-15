package Array.ArrayAlgorithm.Sorting;

public class RearrangeArrayBysign
{
    static int [] rearrange(int []arr){
        int nums[]=new int[arr.length];
        int p1=0;
        int p2=1;
        for(int i:arr){
            if(i<0){
                nums[p2]=i;
                p2+=2;
            }
            else{
                nums[p1]=i;
                p1+=2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int []res=rearrange(arr);
        for (int i:res) {
            System.out.print(" "+i);
        }
    }
}
