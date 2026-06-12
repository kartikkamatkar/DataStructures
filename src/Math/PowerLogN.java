package Math;

public class PowerLogN
{
    static int powerlogn(int x,int n){
        if(n==0){
            return 1;
        }
        int half=powerlogn(x,n/2);
        int power =half*half;
        if((n&1)==1){
            power=x*power;
        }
        return power;
    }
    public static void main(String[] args) {
        int n =4;
        int x =2;
        System.out.println(powerlogn(x,n));
    }
}
