package Array.ArrayAlgorithm;

public class XORProblemMax
{
    static int maxXor(int []arr){
       int max =Integer.MIN_VALUE;
       for(int i =0;i<arr.length;i++){
           for(int j =i+1;j<arr.length;j++){
               max=Math.max(max,arr[i]^arr[j]);
           }
       }
        return max;
    }
    public static void main(String[] args) {
 int arr[]={3,10,5,25,2,8};
        System.out.println(maxXor(arr));
    }
}
