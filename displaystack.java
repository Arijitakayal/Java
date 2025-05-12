import java.util.*;
public class displaystack{
    public static void displayrev(Stack<Integer>st){
        if(st.isEmpty())
        return;
        int top = st.pop();
        System.out.println(top);
        displayrev(st);
        st.push(top);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("enter  number of the elements");
        n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        //System.out.println(st);
        /* Stack<Integer> rt = new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
        }
        while(rt.size()>0)
        {
            
           int x = rt.pop();
            System.err.println(x+"");
            st.push(x);
        }
        System.out.println(st);*/
        /*int a = st.size();
        int[]arr = new int[n];
        for(int i = 0;i<a;i++){
        arr[i]=st.pop();
        }
        for(int i = 0;i<a;i++)
        {
            System.out.println(arr[i]);
            st.push(arr[i]);
        }*/
        displayrev(st);
        sc.close();

    }
}
