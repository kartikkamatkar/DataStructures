package String.CRUD;

public class CRUDinString {

    public static void main(String[] args) {

        String name = "kartik";

        // Read
        System.out.println("Read String:");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        // Search
        char search = 't';
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == search) {
                System.out.println("\nFound at Index = " + i);
                break;
            }
        }

        // Update index 0
        char arr[] = name.toCharArray();
        arr[0] = 'K';
        name = new String(arr);

        System.out.println("After Update:");
        System.out.println(name);

        // Insert X at index 3
        char oldArr[] = name.toCharArray();
        char newArr[] = new char[oldArr.length + 1];

        int index = 3;

        for (int i = 0; i < index; i++) {
            newArr[i] = oldArr[i];
        }

        newArr[index] = 'X';

        for (int i = index; i < oldArr.length; i++) {
            newArr[i + 1] = oldArr[i];
        }

        name = new String(newArr);

        System.out.println("After Insert:");
        System.out.println(name);

        // Delete character at index 2
        char delArr[] = name.toCharArray();
        char newDelArr[] = new char[delArr.length - 1];

        int del = 2;

        for (int i = 0; i < del; i++) {
            newDelArr[i] = delArr[i];
        }

        for (int i = del + 1; i < delArr.length; i++) {
            newDelArr[i - 1] = delArr[i];
        }

        name = new String(newDelArr);

        System.out.println("After Delete:");
        System.out.println(name);

        // Reverse
        char rev[] = name.toCharArray();
        char reverse[] = new char[rev.length];

        int j = 0;

        for (int i = rev.length - 1; i >= 0; i--) {
            reverse[j] = rev[i];
            j++;
        }

        name = new String(reverse);

        System.out.println("After Reverse:");
        System.out.println(name);
    }
}