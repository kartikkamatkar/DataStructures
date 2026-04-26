package Queue.simpleQueue;

import java.util.Scanner;

class Queue{
    int arr[];
    int front ,rear;
    Queue(int len){
        arr=new int[len];
        front=-1 ;
        rear=-1;
    }
    void enqueue(int var){
        if(rear ==arr.length-1){
            System.out.println("The Queue is Full");
        }
        else {
            if(front ==-1){
                front=0;
            }
            rear++;
            arr[rear]=var;
            System.out.println("Element is added :"+var);
        }
    }
    void dequeue(){
        if(front==-1|| front>rear){
            System.out.println("The Queue is Empty :");
        }
        else{
            System.out.println("The Element is Deleted :"+arr[front]);
            front++;
            if(front>rear){
                front=-1;
                rear =-1;
            }
        }
    }
    void peek(){
        if(front==-1||front>rear){
            System.out.println("Queue is Empty :");
        }
        else{
            System.out.println("Front Element is ="+arr[front]);
        }
    }
    void display(){
        if(front==-1||front>rear){
            System.out.println("The Queue is empty :");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println();
        }
    }
    void count(){
        if(front==-1||front>rear){
            System.out.println("Element = 0");
        }
        else{
        System.out.println("total Element "+(rear-front+1));
    }
    }
void Search(int target){
        if(front==-1||front>rear){
            System.out.println("Queue is Empty :");
        }
        else{
            boolean flag =false;
            for(int i =front;i<=rear;i++){
                if(arr[i]==target){
                    flag =true;
                    break;
                }
            }
            if(flag){
                System.out.println("The Element is Found:");
            }
            else{
                System.out.println("Element is not Found :");
            }
        }
}
}
public class QueueOPR
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the length of Queue:");
        int len=s.nextInt();
        Queue q=new Queue(len);
        System.out.println("___________Queue____________");
        int choice;
        do{
            System.out.println("\n1 Enqueue");
            System.out.println("2 Dequeue");
            System.out.println("3 Peek");
            System.out.println("4 Display");
            System.out.println("5 Search");
            System.out.println("6 Count");
            System.out.println("7 Exit");

            System.out.print("Enter Choice: ");
            choice = s.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter Value: ");
                    int val = s.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.print("Enter Element to Search: ");
                    int target = s.nextInt();
                    q.Search(target);
                    break;

                case 6:
                    q.count();
                    break;

                case 7:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 7);

        s.close();
    }
}
