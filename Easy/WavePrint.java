public class WavePrint {
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0;i<4;i++){
            {
                if(i%2==0){
                    for(int j=0;j<4;j++)
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    for(int k=arr.length-1;k>=0;k--)
                    System.out.print(arr[i][k]+" ");
                }
            }
            System.out.println();
        }

        // Coloum
        for(int col=0;col<4;col++){
            {
                for(int row=0;row<4;row++)
                if(row%2==0){
                    System.out.print(arr[row][col]+" ");
                }
                else{
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }

}
