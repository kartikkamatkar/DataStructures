package String.Algorithm;
//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//Example 1:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation:
//
//The strings s and t can be made identical by:
//
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.
public class Isomorphic
{
    public static void main(String[] args) {
        String s="egg",t="agg";
        int arr1[]=new int [256];
        int arr2[]=new int [256];
        for(int i =0;i<s.length();i++){
            int c1=s.charAt(i);
            int c2 =t.charAt(i);
            if(arr1[c1]!=arr2[c2]){
                System.out.println(false);
                return;
            }
            arr1[c1]=i+1;
            arr2[c2]=i+1;

        }
        System.out.println(true);
    }
}
