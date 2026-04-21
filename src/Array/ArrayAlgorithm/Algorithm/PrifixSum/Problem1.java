package Array.ArrayAlgorithm.Algorithm.PrifixSum;
//Range from left to Right
public class Problem1
{
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 5, 3};
        int prifixsum []=new int[arr.length];
        prifixsum[0]=arr[0];
        for(int i =1;i< arr.length;i++){
            prifixsum[i]=arr[i]+prifixsum[i-1];
        }
        System.out.println("Prefix Sum Array :");
        for(int i=0;i< prifixsum.length;i++){
            System.out.print(" "+prifixsum[i]);
        }
        System.out.println("\n The range sum between 2 and 4");
        int l=2;
        int r=4;
        int sum;
        if(l==0){
            sum =prifixsum[r];
        }
        else{
            sum=prifixsum[r]-prifixsum[l-1];
        }
        System.out.println("Sum of the element from  2 to 4 ="+sum);


    }
}
