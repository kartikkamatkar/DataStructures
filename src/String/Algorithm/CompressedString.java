package String.Algorithm;

public class CompressedString
{
    public static StringBuilder compressedString(StringBuilder s){
        StringBuilder sb=new StringBuilder();
        int count=1;
        int n=s.length()-1;
        for(int i =0;i<s.length();i++){
            while(i!=n && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }sb.append(s.charAt(i));
            if(count>1){
                sb.append(count);
            }
            count=1;
        }
        return sb;
    }
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("aaaaaabbbbc");
        System.out.println(compressedString(s));
    }
}
