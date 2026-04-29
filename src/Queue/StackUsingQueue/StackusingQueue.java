package Queue.StackUsingQueue;
class Stack{
    int arr1[],arr2[];
    int front1,rear1,front2,rear2,len1,len2;
    Stack(int size1,int size2){
        len1=size1;
        arr1=new int[len1];
        arr2=new int [len2];
        front1=-1;
        front2=-1;
        rear1=-1;
        rear2=-1;
    }
    void enqueue(){

    }
    void dequeue(){

    }
    void push(int var){

    }
    void pop(){

    }
    void display(){

    }
}
public class StackusingQueue
{
    public static void main(String[] args) {
     Stack s=new Stack(5,6);
     s.pop();
     s.push(20);
     s.push(50);
     s.push(44);
     s.display();
     s.pop();
     s.display();


    }
}
