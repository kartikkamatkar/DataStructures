package Array;
//CRUD Operation in Array
public class CRUDinArray
{
    public static void main(String args[]) {
        //Create
        int arr[] = new int[6];
        arr[0] = 0;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        int size =6;
        // Read
        for (int i = 0; i <size; i++) {
            System.out.print(" " + arr[i]);
        }
        //update
        System.out.println("\nAfter Update :");
        arr[4] = 7;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        //delete
        int delele = 2;
        for (int i = delele; i < size-1 ; i++) {
            arr[i]=arr[i+1];

        }
        size--;
        System.out.println("\n After Deleting element form array" );
        for (int i = 0; i <size; i++) {
            System.out.print(" "+arr[i]);
        }

    }
}
