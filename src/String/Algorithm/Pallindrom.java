package String.Algorithm;

public class Pallindrom
{
    public static void main(String[] args) {
        String name ="kartik";
        boolean flag =true;
        char arr[]=name.toCharArray();
        int l =0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                flag =false;
            }
            l++;
            r--;
        }
        if(flag){
            System.out.println("The String is Pallindrom");
        }
        else {
            System.out.println("The String is not Pallindrom");
        }


    }
}
