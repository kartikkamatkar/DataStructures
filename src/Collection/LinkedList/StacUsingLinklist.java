package Collection.LinkedList;

import java.util.LinkedList;

public class StacUsingLinklist
{
    public static void main(String[] args) {
        LinkedList <Integer> st=new LinkedList<>();
        st.push(40);
        st.push(50);
        st.push(50);
        System.out.println("Stack =" +st);
        System.out.println("Element is Pop from Stack "+st.pop());
        System.out.println("Top Element in Stack Now "+st.peek());

    }
}
