//Itamar Shapira : 315387902
//Ofir Roditi : 208647297
public class AdjacencyMatrix {

    /**
     *  because there is no zero vertex in the Q , we had some adaptation to the answer...
     */
    public static int[][] createAdjacencyMatrix(int n) {
        // Initialize an empty adjacency matrix
        int[][] adjMat = new int[n][n];

        // Iterate over each vertex i
        for (int i = 0; i < n; i++) {
            // Iterate over each vertex j
            for (int j = 0; j < n; j++) {
                // If i is 1 and j is not equal to i, set adjacency to 1
                if (i == 1 && j != 1) {
                    adjMat[i][j] = 1;
                }
                // If both i and j are even and i is less than j, set adjacency to 1
                else if (i % 2 == 0 && j % 2 == 0 && i < j) {
                    adjMat[i][j] = 1;
                } else {
                    adjMat[i][j] = 0;
                }
            }
        }
        return adjMat;
    }

    public static void printAdjacencyMatrix(int[][] adjMat) {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example: n = 5
        int[][] adjacencyMatrix = createAdjacencyMatrix(n);
        printAdjacencyMatrix(adjacencyMatrix);
    }
}
