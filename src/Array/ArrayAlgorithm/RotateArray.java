package Array.ArrayAlgorithm;

public class RotateArray
{
    public static void reverse(int []nums,int l ,int r){
        while (l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k =3;
        int n =arr.length;
        k%=n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
