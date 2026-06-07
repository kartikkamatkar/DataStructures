package Recursion;

public class Print1to10
{
    public static void print1to10(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        print1to10(n+1);
    }
    public static void main(String[] args) {
        int n =1;
        print1to10(n);
    }
}