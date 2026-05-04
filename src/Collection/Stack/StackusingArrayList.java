package Collection.Stack;
import java.util.ArrayList;
public class StackusingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        // push
        a.add(20);
        a.add(40);
        a.add(60);
        System.out.println("Stack: " + a);
        // peek
        if (!a.isEmpty()) {
            int top = a.get(a.size() - 1);
            System.out.println("Top: " + top);
        } else {
            System.out.println("Stack empty");
        }
        // pop
        if (!a.isEmpty()) {
            int removed = a.remove(a.size() - 1);
            System.out.println("Popped: " + removed);
        } else {
            System.out.println("Nothing to pop");
        }
        System.out.println("Stack after pop: " + a);
    }
}