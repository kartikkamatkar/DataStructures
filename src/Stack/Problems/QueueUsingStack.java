package Stack.Problems;
class QueueUsingStack {
    int size;
    int arr[];
    int top1;
    int top2;
    QueueUsingStack(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
    void enqueue(int data) {
        if (top1 < top2 - 1) {
            arr[++top1] = data;
        } else {
            System.out.println("Queue Overflow");
        }
    }
    int dequeue() {
        if (top1 == -1 && top2 == size) {
            System.out.println("Queue Empty");
            return -1;
        }
        if (top2 == size) {
            while (top1 != -1) {
                arr[--top2] = arr[top1--];
            }
        }
        return arr[top2++];
    }
    void display() {
        for (int i = top2; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Deleted: " + q.dequeue());
        q.display();
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println("Deleted: " + q.dequeue());
        q.display();
    }
}