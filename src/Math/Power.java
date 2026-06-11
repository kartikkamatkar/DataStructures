package Math;


public class Power
{
    static double power(int x ,int n){
    long N=n;
    if(n<0){
        x=1/x;
        N=-N;
    }
    double ans =1;
    while(N>0){
        if((N&1)==1)
        {
         ans*=x;
        }
        x*=x;
        N>>=1;
    }
    return ans;
    }
    static double mathfun(int x,int n){
        return Math.pow(x,n);
    }

    public static void main(String[] args) {
        var n =10;
        var x =2;
        if(mathfun(x,n)==power(x,n)){
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }
    }
}
