package String.Algorithm;
//Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
//
//If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
//
//
//
//Example 1:
//
//Input: s = "abcdefg", k = 2
//Output: "bacdfeg"
//Example 2:
//
//Input: s = "abcd", k = 2
//Output: "bacd"
public class ReverseStringII {
    public static void main(String[] args) {
        String s ="abcdefg";//output :"bacdfeg"
        int k =2;
        for(int i =0;i<s.length();i+=k*i){
            int l =0;
            int r =Math.min(k+i-1,s.length()-1);
            while(l<r)
        }

    }
}
