import java.util.Arrays;
import java.util.List;

public class PeakElement2D {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 9, 15,12},
                {30, 15, 14,44},
                {35, 16, 32,1}
        };

        List<Integer> peak = findPeakGrid(mat);
        System.out.println("Peak Element is at: " + peak);
    }

    private static int findMaxIndex(int[][] mat, int n, int col) {
        int maxValue = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public static List<Integer> findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int maxRowIndex = findMaxIndex(mat, n,  mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1;

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return Arrays.asList(maxRowIndex, mid);
            } else if (mat[maxRowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return Arrays.asList(-1, -1);
    }
}
