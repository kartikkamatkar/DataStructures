package String.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram
{
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String ,List<String >>map =new HashMap<>();
        for(String s :strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key =new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
           map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
       String strs[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
