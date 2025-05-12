import java.util.*;
public class infix{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)
            {
                val.push(ascii-48);
            }
            else if(op.isEmpty()|| ch =='('|| op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')')
            {
                while(ch!='('&&!op.isEmpty()){
                    int val1= val.pop();
                    int val2 = val.pop();
                    if(op.peek()=='-') val.push(val2-val1);
                    if(op.peek()=='+') val.push(val2+val1);
                    if(op.peek()=='*') val.push(val2*val1);
                    if(op.peek()=='/') val.push(val2/val1);
                    op.pop();   
                }
               if(!op.isEmpty()) op.pop();
            }
            else{
                if(ch=='+'|| ch == '-'){
                    int val1= val.pop();
                    int val2 = val.pop();
                    if(op.peek()=='-') val.push(val2-val1);
                    if(op.peek()=='+') val.push(val2+val1);
                    if(op.peek()=='*') val.push(val2*val1);
                    if(op.peek()=='/') val.push(val2/val1);
                    op.pop();
                    op.push(ch);





                }
            if(ch =='*'||ch =='/'){
                if(op.peek()=='*'||op.peek()=='/'){
                    int val1= val.pop();
                    int val2 = val.pop();
                    
                    if(op.peek()=='*') val.push(val1*val2);
                    if(op.peek()=='/') val.push(val1/val2);
                    op.pop();
                    op.push(ch);

                }
                else op.push(ch);
            }
            }
        }
        while(!op.isEmpty()) 
            
        {
            int val1= val.pop();
            int val2 = val.pop();
            if(op.peek()=='-') val.push(val2-val1);
            if(op.peek()=='+') val.push(val2+val1);
            if(op.peek()=='*') val.push(val2*val1);
            if(op.peek()=='/') val.push(val2/val1);
            op.pop();
               
        }
        System.out.println(val.peek());


    }
}