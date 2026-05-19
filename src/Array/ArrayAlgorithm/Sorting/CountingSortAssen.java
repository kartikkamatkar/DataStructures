package Array.ArrayAlgorithm.Sorting;

import java.lang.reflect.Array;

public class CountingSortAssen
{
    public static void countingSort(int arr[]){
       int largest =Integer.MIN_VALUE;
       for(int i =0;i< arr.length;i++){
           largest=Math.max(largest,arr[i]);
       }
        int count[]=new int[largest+1];
        for(int i =0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i = 0;i< count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,2,5,6,7,6};
        System.out.println("Before Sorting :");
        for(int num:arr){
            System.out.print(arr[num]+" ");
        }
        System.out.println();
        System.out.println("After sorting :");
        countingSort(arr);
        printarr(arr);
    }
}
