import java.util.*;
public class linkedlistimplementationofstack{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null)
            return ;
            displayrec(h.next);
            System.out.print(h.val + " ");

        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        void displayrev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.err.println("Stack is empty");
                return -1;
                }
                int x= head.val;
                head = head.next;
                return x;
        }
        int peek(){
            if(head==null){
                System.err.println("Stack is empty");
                return -1;
                }
                return head.val;

        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            else return false;
        }
    }
    public static void main(String[]args){
    Stack st = new Stack();
        st.push(2);
        st.push(6);
        st.push(8);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(3);
        st.push(4);
        st.push(10);
    }
}