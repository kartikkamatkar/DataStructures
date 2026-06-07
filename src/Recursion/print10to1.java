package Recursion;

public class print10to1
{
    public static void print10to1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print10to1(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        print10to1(n);

    }
}
