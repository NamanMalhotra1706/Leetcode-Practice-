import java.util.Scanner;

public class SpiralTriversal {

    // Using Box Method
   public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minRow=0;
        int minCol=0;

        int maxRow=arr.length-1;
        int maxCol = arr[0].length-1;
        int totalEle =  row*col;
        int count=0;


        while(count<totalEle){
            //left Wall
            for(int i=minRow;i<=maxRow && count < totalEle;i++){
                System.out.println(arr[i][minRow]);
                count++;
            }
            minCol++;
            //Bottom Wall
            for(int i=minCol;i<=maxCol && count < totalEle;i++){
                System.out.println(arr[maxRow][i]);
                count++;
            }
            maxRow--;    
            //Right Wall
            for(int i=maxRow;i>=minRow && count < totalEle;i--){
                System.out.println(arr[i][maxCol]);
                count++;
            }
            maxCol--;
            //Top Wall
            for(int i=maxCol;i>=minCol && count < totalEle;i--){
                System.out.println(arr[minRow][i]);
                count++;
            }
            minRow++;
        }
   } 
}
