package Array.ArrayAlgorithm.Sorting;
//Bubble Sort in Array
public class BubbleSort
{
    public static void main(String[] args) {
        int arr[]={6,4,7,5,4,2,1};
        System.out.println("Before Sorting :");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n After the Sorting :");
        System.out.println(" \n in Ascending ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" "+arr[i]);
            }
        for (int i = 0; i < arr.length; i++) {
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n in descending ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
