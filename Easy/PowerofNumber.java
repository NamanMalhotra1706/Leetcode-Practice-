public class PowerofNumber {
    long power(int N,int R)
    {
       if(R==1){
            return N;
        }
        long temp = power(N,R/2)%1000000007;
        long res = (temp*temp)%1000000007;
        if(R%2==0){
             return res;
        }
        else return (res*N)%1000000007;
    }
}
