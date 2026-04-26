package Queue.DoubleEndedQueue;
//Duble ended Queue
class Queue {
    int len;
    int arr[], front, rear;
    Queue(int size) {
        len = size;
        arr = new int[len];
        front = -1;
        rear = -1;
    }
    void insertatfront(int var) {
        if ((rear + 1) % len == front) {
            System.out.println("Deque is Full");
        }
        else if (front == -1) {
            front = rear = 0;
        }
        else {
            front = (front - 1 + len) % len;
        }
        arr[front] = var;
    }
    void insertatend(int var) {
        if ((rear + 1) % len == front) {
            System.out.println("Deque is Full");
        }
        else if (front == -1) {
            front = rear = 0;
        }
        else {
            rear = (rear + 1) % len;
        }
        arr[rear] = var;
    }
    void deleteatstart() {
        if (front == -1) {
            System.out.println("Deque is Empty");
        }
        else if (front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % len;
        }
    }
    void deleteatend() {
        if (front == -1) {
            System.out.println("Deque is Empty");
        }
        else if (front == rear) {
            front = rear = -1;
        }
        else {
            rear = (rear - 1 + len) % len;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Deque is Empty");
        }
        else {
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % len;
            }
            System.out.println();
        }
    }
}
public class Dqueue {
    public static void main(String[] args) {
        Queue d = new Queue(5);
        d.insertatend(10);
        d.insertatend(20);
        d.insertatfront(5);
        d.insertatend(30);
        d.display();
        d.deleteatstart();
        d.deleteatend();
        d.display();
    }
}