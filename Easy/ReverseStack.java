import java.util.Stack;

class ReverseStack{
    static void reverse(Stack<Integer> s)
    {
       if (s.empty()) {
            return;
        }
        
        Integer i = s.get(0);
        s.remove(0);
        
        reverse(s);
        
        s.push(i);
    }

    public static void main(String[] args) {
        
    }
}