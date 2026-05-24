package String.Algorithm;

public class PallindromII
{
    public static String pallindrom(String var){
        for(int i =0;i<var.length()/2;i++){
            if(var.charAt(i)!=var.charAt(var.length()-i-1)){
                return "The String i not Pallindrom";
            }
        }
        return "The String is Pallindrom ";

    }
    public static void main(String[] args) {
        String var ="MOM";
        System.out.println(pallindrom(var));
    }
}
