//Itamar Shapira : 315387902
//Ofir Roditi : 208647297
import java.util.ArrayList;
import java.util.List;

public class NeighborhoodList {

    public static List<List> createNeighborhoodList(int n) {
        // Initialize an empty main list (mainCOl) to store neighborhoods.
        List<List> mainCol = new ArrayList<>();

        // Iterate over each vertex from 1 to n
        for (int i = 1; i <= n; i++) {
            // Create an empty list to represent the neighborhood of the current vertex
            List<Integer> neighborhood = new ArrayList<>();

            // If the current vertex is 1, add all other vertices to its neighborhood
            if (i == 1) {
                for (int j = 2; j <= n; j++) {
                    neighborhood.add(j);
                }
            }
            // If the current vertex is even, add greater even vertices to its neighborhood
            else if (i % 2 == 0) {
                for (int j = i + 2; j <= n; j += 2) {
                    neighborhood.add(j);
                }
            }

            // Add the neighborhood of the current vertex to the list of neighborhoods !!
            mainCol.add(neighborhood);
        }

        return mainCol;
    }

    public static void printNeighborhoodList(List<List> neighborhoodList) {
        // Iterate over each vertex and print its neighborhood
        for (int i = 0; i < neighborhoodList.size(); i++) {
            System.out.println("Neighborhood of vertex " + (i + 1) + ": " + neighborhoodList.get(i));
        }
//        System.out.println("how to get specific:");
//        System.out.println("the last Neighborhood of vertex " + (1) + ": " + neighborhoodList.get(0).get(3));
    }

    public static void main(String[] args) {
        int n = 5; // Example: n = 5
        List<List> neighborhoodList = createNeighborhoodList(n);
        printNeighborhoodList(neighborhoodList);
    }
}
