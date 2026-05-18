package Array.ArrayAlgorithm.Sorting;

public class CountingSort
{
    public static void countingSort(int arr[]) {
    int largest =Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
    }
    int count[]=new int[largest+1];
    for(int i =0;i< arr.length;i++){
        count[arr[i]]++;
    }
    int j =0;
    for(int i =count.length-1;i>=0;i--){
        while (count[i]>0){
            arr[j]=i;
        j++;
        count[i]--;
        }
    }
    }
    public static void printarr(int arr[]){
        System.out.println("Sorted Array :");
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" -> ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,2,4,5,6,2,5};
        countingSort(arr);
        printarr(arr);

    }
}
