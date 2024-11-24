import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GraphMatrixDvirAlgo {
    public static void main(String[] args) {
        // Example graph represented as a matrix
        int[][] matrix = {
                {0, 1, 0, 0,0,0},
                {1, 0, 1, 1,1,1},
                {0, 1, 0, 1,0,0},
                {0, 1, 1, 0,1,1},
                {0, 1, 0, 1,0,1},
                {0, 1, 0, 1,1,0}
        };

        ArrayList<Integer> arrayList = new ArrayList<>();

        // Extract number and insert it into new ArrayList
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder element = new StringBuilder();
            for (int j = 0; j < matrix[0].length; j++)
            {
                element.append(matrix[i][j]);
            }
            // Reverse the number to calculate the decimal number (vertex 1 is LSB)
            element.reverse();
            // Convert the binary string to a decimal number
            int decimalValue = Integer.parseInt(element.toString(), 2);
            arrayList.add(decimalValue);
        }

        // Sort in descending order
        arrayList.sort(Comparator.reverseOrder());

        // Insertion to the new matrix as sorted matrix
        for (int i = 0; i < matrix.length; i++)
        {
            String binaryString = Integer.toBinaryString(arrayList.get(i));

            String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
            System.out.println("Reversed binary string: " + reversedBinaryString);

            // Pad the binary string with leading zeros if necessary
            while (reversedBinaryString.length() < matrix[0].length)
            {
                reversedBinaryString =  reversedBinaryString + "0";
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = reversedBinaryString.charAt(j) - '0'; // Convert char to int
//                if (i == j) {
//                    matrix[i][j] = 1; // Insert a self edge
//                }
            }
        }

        // Print the new matrix
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
