package String.Algorithm;
//Reverse String Using the Two Pointer
public class ReverseString
{
    public static void main(String[] args) {
        String name ="Kartik";
        char arr[]=name.toCharArray();
        int l =0;
        int r = arr.length-1;
        while(l<r){
            char temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
        name=new String(arr);
        System.out.println(name);
    }
}
