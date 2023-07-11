public class kthEleofMatrix {

    int findK(int A[][], int n, int m, int k) {
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        int count = 0;

        while (left <= right && top <= bottom) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k) {
                    return A[top][i];
                }
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) {
                    return A[i][right];
                }
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) {
                        return A[bottom][i];
                    }
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) {
                        return A[i][left];
                    }
                }
                left++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
