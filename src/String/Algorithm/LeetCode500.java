package String.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//500. Keyboard Row
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
//
//Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
//
//In the American keyboard:
//
//the first row consists of the characters "qwertyuiop",
//the second row consists of the characters "asdfghjkl", and
//the third row consists of the characters "zxcvbnm".
class LeetCode500{
    static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            String row;
            char first = lower.charAt(0);

            if (row1.indexOf(first) != -1) {
                row = row1;
            } else if (row2.indexOf(first) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            for (char ch : lower.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        System.out.println(Arrays.toString(findWords(words)));
    }
}