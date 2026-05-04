package Collection.Stack;

import java.util.Stack;

public class StackUsingVector {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // push values
        s.push(50);
        s.push(40);
        s.push(20);

        System.out.println("Stack: " + s);

        // peek top
        if (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
        } else {
            System.out.println("Stack empty");
        }

        // pop element
        if (!s.isEmpty()) {
            System.out.println("Popped: " + s.pop());
        } else {
            System.out.println("Nothing to pop");
        }

        // size
        System.out.println("Size: " + s.size());

        // search element
        int pos = s.search(40);
        if (pos != -1) {
            System.out.println("40 at pos: " + pos);
        } else {
            System.out.println("40 not found");
        }

        // empty check
        System.out.println(s.isEmpty() ? "Stack empty" : "Stack not empty");

        // clear stack
        while (!s.isEmpty()) {
            System.out.println("Removing: " + s.pop());
        }

        // try unsafe ops
        try {
            s.pop();
        } catch (Exception e) {
            System.out.println("Stack empty");
        }

        try {
            s.peek();
        } catch (Exception e) {
            System.out.println("Stack empty");
        }
    }
}