package LinkedList;
class Node{
    int data ;
    Node next ;
    Node(int val){
        data=val;
        next =null;
    }
}
class LinkedList{
Node head;
void insertatend(int val){
    Node n =new Node(val);
    if(head==null){
        head =n;
        return;
    }
    Node temp =head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=n;
}
void insertatstart(int val){
    Node n =new Node(val);
    n.next=head;
    head=n;
}
void deleteatstart(){
    if(head==null){
        System.out.println("List Empty :");
        return;
    }
    head=head.next;
}
void deleteatend(){
    if(head==null){
        return;
    }
    if(head.next==null){
        head =null;
        return;
    }
    Node temp =head;
    while (temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
}
void display(){
    if(head ==null){
        System.out.println("List is Empty :");
        return;
    }
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp =temp.next;
    }
    System.out.println("null ");
}
}
public class Main
{
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatend(30);
        list.display();
        list.insertatstart(5);
        list.display();
        list.deleteatstart();
        list.display();
        list.deleteatend();
        list.display();
    }
}
