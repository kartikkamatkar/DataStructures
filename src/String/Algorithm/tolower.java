package String.Algorithm;

public class tolower
{
    static String toLower(String s){
        String a=s.toLowerCase().trim();
        return a;
    }
    public static void main(String[] args) {
        String s ="Hello World";
        System.out.println(toLower(s));
    }
}
