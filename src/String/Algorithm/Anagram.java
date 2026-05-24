package String.Algorithm;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//
//
//        Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true


public class Anagram {
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
       int freq[]=new int[26];
       for(int i =0;i<s.length();i++){
           freq[s.charAt(i)-'a']++;
           freq[t.charAt(i)-'a']--;
       }
       for(int i =0;i<26;i++){
           if(freq[i]!=0){
               return false;
           }
       }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t ="nagapam";
        System.out.println(anagram(s,t));
    }
}
