package Array.ArrayAlgorithm.Searching;
//Binary Search
public class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int l=0;
        int target=5;
        boolean flag =false;
        int r= arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println("Element is Found:"+mid);
                flag=true;
                break;
            }
            else if (arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
        }
        }
        if(!flag){
            System.out.println("Element not found:");

        }
    }
}
