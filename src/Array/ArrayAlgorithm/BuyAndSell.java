package Array.ArrayAlgorithm;

public class BuyAndSell
{
    static int buyandsell(int []nums){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i :nums){
            if(i<min){
                min=i;
            }
            int profit=i-min;
            if(profit>max){
                max=profit;
            }
        }
        return max;
}
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        System.out.println(buyandsell(nums));
    }
}
