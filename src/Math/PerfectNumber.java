package Math;

public class PerfectNumber
{
    public static boolean checkPerfectNumber(int num)
    {
        int sum =0;
        for(int i =1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num =7;
        System.out.println(checkPerfectNumber(num));
    }
}
