import java.util.Stack;

class dltMid{

    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int mid= (sizeOfStack+1)/2;
         double res = Math.ceil(mid);
        s.remove((int)res-1);
        return;
    } 

    public static void main(String[] args) {
        
    }
}
