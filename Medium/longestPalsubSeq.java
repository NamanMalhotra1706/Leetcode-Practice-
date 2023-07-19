public class longestPalsubSeq {
    public int longestPalinSubseq(String str)
    {
        int n = str.length();
        int strArr[][] = new int[n][n];


        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    strArr[i][j] = 1;

                } else if (g == 1) {
                   strArr[i][j] = str.charAt(i)==str.charAt(j)? 2:1;
                }
                else{
                    if(str.charAt(i)==str.charAt(j))
                    {
                        strArr[i][j] = 2 +  strArr[i+1][j-1];
                    }
                    else{
                        strArr[i][j] =  Math.max(strArr[i+1][j], strArr[i][j-1]);
                    }
                }
            }
        }
        return strArr[0][n-1];
    }
    public static void main(String[] args) {
        
    }
}
