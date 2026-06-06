package String.Algorithm;

public class ReverseWord
{
    static String reverseWord(String s ){
        StringBuilder sb =new StringBuilder();
        String words[]=s.trim().split("\\s+");
        for(int i =words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s ="the sky is blue ";
        System.out.println(reverseWord(s));
    }
}
