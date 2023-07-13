public class ReverseInteger {
    public int reverse(int x) {
        int revNumber=0;
        while(x!=0){
            int rem = x%10;
            if((revNumber > Integer.MAX_VALUE/10) || (revNumber < Integer.MIN_VALUE/10)){
                return 0;
            }
            revNumber = (revNumber *10) + rem;
            x=x/10;
        }
        return revNumber;
    }
}
