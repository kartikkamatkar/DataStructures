package Queue.CircularQueue;

class Queue {
    int arr[], front, rear, len;

    Queue(int size) {
        len = size;
        front = -1;
        rear = -1;
        arr = new int[len];
    }

    void enqueue(int var) {
        if ((rear + 1) % len == front) {
            System.out.println("Queue is Full");
        }
        else if (front == -1) {
            front = 0;
            rear = 0;
            arr[rear] = var;
            System.out.println("Element Added");
        }
        else {
            rear = (rear + 1) % len;
            arr[rear] = var;
            System.out.println("Element Added");
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        }
        else if (front == rear) {
            System.out.println("Deleted: " + arr[front]);
            front = -1;
            rear = -1;
        }
        else {
            System.out.println("Deleted: " + arr[front]);
            front = (front + 1) % len;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        }
        else {
            int i = front;
            System.out.print("Elements: ");
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

public class CircularQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}