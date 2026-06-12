import  java.lang.*;
class Main{
    public static void main(String[] args)
    {
        var x='s';
        System.out.println(((Object) x).getClass().getName());
        int a=5;
        int y=3;
        double r= a/y;
        System.out.println(r);
    }
}