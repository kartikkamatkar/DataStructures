package Stack.Problems;

import java.util.Scanner;

//1. Push
//2. Pop
//3. Peek
//4. Display
//5. Search Element
//6. Count Elements
//7. Exit
class Stack{
    int arr[];
    int top =-1;
    Stack(int length){
        arr=new int[length];
    }
    //push
    void push(int var){
        if(top== arr.length-1){
            System.out.println("Stack is Full ");
        }
        else{
            System.out.println("Element is added :"+var);
            top++;
            arr[top]=var;
        }
    }
    void peep(){if(top==-1){
        System.out.println("Stack is Empty:");}
    else{
        System.out.println("The Top Element is ="+arr[top]);
    }
    }
    void display(){
        if(top==-1){
            System.out.println("The Stack is Empty :");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.print("The Element in the Stack :"+" "+arr[i]);
            }
        }}
    void pop(){
        if(top==-1){
            System.out.println("The Stack is Empty:");
        }
        else {
            System.out.println("The Top Element ="+arr[top]);
            top--;
        }
    }
    void Search(int target){
        if(top==-1){
            System.out.println("Stack i Empty :");
        }
        else {
            boolean flag=false;
            for(int i=top;i>=0;i--){
                if(arr[i]==target){
                    flag =true;
                    break;
                }
            }
            if(flag){
                System.out.println("Element is Found:");
            }
            else{
                System.out.println("Element is not found :");
            }
        }}
    void count() {
        System.out.println("Total Elements = " + (top + 1));
    }
}

public class MenuDriven
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Length of Stack :");
        int len =scan.nextInt();
        Stack s =new Stack(len);
        System.out.println("_____________Stack Operation____________");
        System.out.println("Enter the Choice");
        int choice;
        do {
            System.out.println("\n1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Peek");
            System.out.println("4 Display");
            System.out.println("5 Search");
            System.out.println("6 Count");
            System.out.println("7 Exit");

            System.out.print("Enter Choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Value: ");
                    int val = scan.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peep();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.print("Enter Element to Search: ");
                    int target = scan.nextInt();
                    s.Search(target);
                    break;

                case 6:
                    s.count();
                    break;

                case 7:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);

        scan.close();
    }
    }
