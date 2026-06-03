package String.Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

//806. Number of Lines To Write String
public class Leetcode806
{
    static int []numberOfLines(int []widths,String s){
        int lines=1;
        int width=0;
        for(char c:s.toCharArray()){
            int w =widths[c-'a'];
            if(w+width<=100){
                width+=w;
            }
            else{
                lines++;
                width=w;
            }
        }
        return new int[]{lines,width};
    }
    public static void main(String[] args) {
        int widths[] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int [] ans =numberOfLines(widths,s);
        System.out.println(Arrays.toString(ans));
    }
}
