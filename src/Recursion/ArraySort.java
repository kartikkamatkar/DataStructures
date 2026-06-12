package Recursion;

public class ArraySort
{
    public static String arraysort(int[] arr,int i)
    {
        if(i == arr.length){
        return arr.toString();
    }
        if(arr[i]<arr[i-1]){
            int temp =arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        return arraysort(arr,i+1).toString();
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,6};
        System.out.println(arraysort(arr,1));
    }
}
