import java.util.*;
public class stack3{
    public static void main(String[] args) {
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
        System.out.println(st);
        int idx = 2;
        int x = 1;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx)
        {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size()>0)
         {
            st.push(rt.pop());
            
        }
        System.err.println(st);



    }
}