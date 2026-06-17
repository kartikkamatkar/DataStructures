package Array.ArrayAlgorithm;

public class RemoveDublicate
{
    public static int removeDublicate(int []arr){
        int k =1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDublicate(arr));
    }
}
