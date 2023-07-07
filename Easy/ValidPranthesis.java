import java.util.Stack;

class ValidPranthesis{

     public static boolean isOpening(char c){
        if(c=='(' || c=='{' || c=='[')
        return true;

        return false;
    }

    public static boolean isClosing(char c){
        if(c==')' || c=='}' || c==']')
        return true;

        return false;
    }

    public static boolean isMatching(char a , char b){
        if(a=='(' && b==')')
        return true;

        else if(a=='{' && b=='}')
        return true;

        else if(a=='[' && b==']')
        return true;

        return false;
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++){

            char s = str.charAt(i);

            if(isOpening(s)){
                stack.push(s);
            }

            else if(isClosing(s)){
                if(stack.empty())
                return false;

                else if(!isMatching(stack.peek(),s))
                return false;

                else
                stack.pop();
            }
        }
            if(stack.empty()){
                return true;
            }
            else
            return false;
    }
    public static void main(String[] args) {
        String s = "()";

        System.out.print(isValid(s));
    }
}