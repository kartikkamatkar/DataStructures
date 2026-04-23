package Stack;

import java.util.Scanner;

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
}
public class StackOPR
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Length:");
        int length=scan.nextInt();
        Stack s=new Stack(length);
        s.peep();
        s.pop();
        s.display();
        s.push(34);
        s.push(44);
        s.push(54);
        s.push(56);
        s.push(66);
        s.pop();
        s.pop();
        s.peep();
        s.pop();
        s.display();
scan.close();
    }
}
