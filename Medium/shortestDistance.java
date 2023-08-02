import java.util.*;

class Pair{  
    int first,second,third;
    Pair(int dis,int a,int b){
        first=dis;
        second=a;
        third=b;
    }
}

class shortestDistance {
    
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        //BFS traversal of A using Queue
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,0)); //we start from first position where dis=0,i=0 and j=0
        int ti[]={0,-1,1,0}; // both ti[] and tj[] will be used to check left,right,up and down from current position
        int tj[]={1,0,0,-1}; // for example for ti[0]=0 and tj[0]=1 we will check on the right side and for ti[1]=-1 and tj[1]=0 we will check ont he above
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int dis=temp.first,i=temp.second,j=temp.third;
            if(i==X && j==Y) return dis; //if we find x and y we return the dis
            for(int k=0;k<4;k++){
                int newi=i+ti[k],newj=j+tj[k]; 
                if(newi>=0 && newj>=0 && newi<N && newj<M && A[newi][newj]==1){ //here we are checking so that the positions don't go out of bounds and the next position we are checking is 1
                    A[newi][newj]=0; //making the position zero so we do not traverse throug it again
                    q.add(new Pair(dis+1,newi,newj)); // incrementing the distance and adding the new newj and newi positions
                }
            }
        }
        return -1;
    }
};