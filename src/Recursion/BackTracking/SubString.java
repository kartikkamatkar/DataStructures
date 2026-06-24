package Recursion.BackTracking;

public class SubString
{
    public static void subString(String s , String ans ,int i ){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        subString(s,ans+s.charAt(i),i+1);
        subString(s,ans,i+1);

    }
    public static void main(String[] args) {
        String s ="abcd";
        subString(s,"",0);
    }
}
