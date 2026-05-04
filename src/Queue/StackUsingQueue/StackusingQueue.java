package Queue.StackUsingQueue;
class Stack {
    int arr1[], arr2[];
    int front1, rear1, front2, rear2, len1, len2;
    Stack(int size1, int size2) {
        len1 = size1;
        len2 = size2;
        arr1 = new int[len1];
        arr2 = new int[len2];
        front1 = rear1 = -1;
        front2 = rear2 = -1;
    }
    void enqueue1(int x) {
        if (rear1 == len1 - 1) return;
        if (front1 == -1) front1 = 0;
        arr1[++rear1] = x;
    }
    void enqueue2(int x) {
        if (rear2 == len2 - 1) return;
        if (front2 == -1) front2 = 0;
        arr2[++rear2] = x;
    }
    int dequeue1() {
        if (front1 == -1) return -1;
        int val = arr1[front1++];
        if (front1 > rear1) front1 = rear1 = -1;
        return val;
    }

    // push operation
    void push(int x) {
        enqueue1(x);
    }

    // pop operation
    void pop() {
        if (front1 == -1) {
            System.out.println("Stack Empty");
            return;
        }

        // move n-1 elements to queue2
        while (front1 < rear1) {
            enqueue2(dequeue1());
        }
        System.out.println("Popped: " + dequeue1());
        int[] tempArr = arr1;
        arr1 = arr2;
        arr2 = tempArr;
        int tempFront = front1;
        front1 = front2;
        front2 = tempFront;
        int tempRear = rear1;
        rear1 = rear2;
        rear2 = tempRear;
    }
    void display() {
        if (front1 == -1) {
            System.out.println("Empty");
            return;
        }
        for (int i = front1; i <= rear1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
public class StackusingQueue {
    public static void main(String[] args) {
        Stack s = new Stack(5, 5);
        s.push(20);
        s.push(50);
        s.push(44);
        s.display();
        s.pop();
        s.display();
    }
}