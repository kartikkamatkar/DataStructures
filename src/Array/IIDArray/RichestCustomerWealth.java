package Array.IIDArray;

public class RichestCustomerWealth
{
    public static int maximumWealth(int [][]accounts){
        int max =Integer.MIN_VALUE;
        for(int i =0;i<accounts.length;i++){
            int sum =0;
            for(int j =0;j<accounts[0].length;j++){
               sum =sum+accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 4}
        };

        System.out.println("Richest Customer Wealth: "
                + maximumWealth(accounts));
    }
}
