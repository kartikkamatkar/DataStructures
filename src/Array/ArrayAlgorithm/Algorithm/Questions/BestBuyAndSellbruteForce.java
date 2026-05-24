package Array.ArrayAlgorithm.Algorithm.Questions;

public class BestBuyAndSellbruteForce
{
    public static int buyAndSell(int []prices){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int price :prices){
            if(price<min){
                min =price;
            }
            int profit =price-min;
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int  prices []= {7,1,5,3,6,4};
        int res =buyAndSell(prices);
        System.out.println(res);
    }
}
