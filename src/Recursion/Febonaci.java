package Recursion;

public class Febonaci
{
    static int febonaci(int n ){
        if(n==1){
        return 1;
        }
        if(n==0){
            return 0;
        }
        int a =febonaci(n-1);
        int b =febonaci(n-2);
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        int n=5;
        int res =febonaci(n);
        System.out.println(res);
    }
}
