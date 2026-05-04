package Math;

public class DigitPlusOne
{
    static int [] digitplusone(int arr[]){
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int res[]=new int[arr.length+1];
        res[0]=1;
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int res[]=digitplusone(arr);
        for(int i =0;i< res.length;i++){
            System.out.print(" "+res[i]);
        }
    }
}
