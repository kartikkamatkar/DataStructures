package Array.ArrayAlgorithm.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,4,5,7};
        boolean flag=false;
        int search =3;
        for (int i = 0; i < arr.length ; i++) {
            if(search==arr[i]){
                flag =true;
                break;
            }
        }
        if(flag) System.out.println("Element is Found ");
        else System.out.println("Element is not Found ");
    }
}
