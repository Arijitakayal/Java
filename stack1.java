import java.util.*;
public class stack1{
    public static void main (String[]args){
        Stack<Integer>st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(16);
        //peek operation
        System.out.println(st.peek());
    }
}