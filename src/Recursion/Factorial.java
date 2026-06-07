package Recursion;

public class Factorial
{
    static int factorial(int num) {
        if (num == 1 || num ==0 ){
            return 1;
        }
        num =num *factorial(num-1);
        return num;
    }
    public static void main(String[] args) {
        int num=5;
        int res=factorial(num);
        System.out.println(res);
    }
}
