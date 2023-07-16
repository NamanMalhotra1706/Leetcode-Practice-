public class queueRev {
    public Queue<Integer> rev(Queue<Integer> q){
      
        Stack<Integer>  newStack = new Stack<>();
        
         while(!q.isEmpty()){
      
          int ele = q.poll();
          newStack.push(ele);
         
         }
         
         while(!newStack.isEmpty()){
             q.offer(newStack.pop());
         }
         
         return q;
      }

      public static void main(String[] args) {
        
      }
}
