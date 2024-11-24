# Algorithm Implementations - Java

---

## Contributors

- **Itamar Shapira**
- **Ofir Roditi**

---

This repository contains a collection of Java programs developed during coursework in the **Algorithms** and **Operating Systems** courses. Each file demonstrates an implementation of algorithms or solutions to specific computational problems, with clear explanations.

## Directory Structure

### `algorithms/`

- **`Minimum_Insertions_to_Make_String_Palindrome.java`**:

  - **Purpose**: Calculates the minimum number of insertions required to make a string a palindrome.
  - **Key Algorithm**: Longest Common Subsequence (LCS) using Dynamic Programming.
  - **Highlights**:
    - Compares the original string with its reversed version.
    - Uses the difference between the string length and the LCS to calculate the result.
  - **Example**:
    - Input: `"ab3bd"`
    - Output: `2` (minimum insertions to make the string `"ab3bd"` a palindrome).
  - **Application**: String manipulation and sequence alignment.

- **`TilingDominoes.java`**:
  - **Purpose**: Counts the number of ways to tile a `2 x n` board using `1 x 2` dominoes.
  - **Key Algorithm**: Dynamic Programming with Bitmasking to represent column states.
  - **Highlights**:
    - Computes the number of valid tilings recursively.
    - Uses binary states to represent column configurations.
  - **Example**:
    - Input: `n = 4`
    - Output: `11` (11 ways to tile a `2 x 4` board).
  - **Application**: Combinatorics and tiling patterns.

---

### `graph_theory/`

- **`GraphMatrixDvirAlgo.java`**:

  - **Purpose**: Processes an adjacency matrix by reordering rows based on their binary representation.
  - **Key Algorithm**: Binary Sorting and Matrix Manipulation.
  - **Highlights**:
    - Extracts binary strings, converts them to decimal, and sorts.
    - Reconstructs the matrix based on sorted values.
  - **Application**: Graph representation and binary manipulation.

- **`NeighborhoodList.java`**:

  - **Purpose**: Creates a neighborhood list (adjacency list) for a graph with custom rules.
  - **Key Algorithm**: Graph adjacency list creation.
  - **Highlights**:
    - For vertex 1, adds all other vertices as neighbors.
    - For even vertices, adds greater even vertices as neighbors.
  - **Example**:
    - Input: `n = 5`
    - Output:
      ```
      Neighborhood of vertex 1: [2, 3, 4, 5]
      Neighborhood of vertex 2: [4]
      Neighborhood of vertex 3: []
      Neighborhood of vertex 4: []
      Neighborhood of vertex 5: []
      ```
  - **Application**: Efficient graph traversal and adjacency representations.

- **`AdjacencyMatrix.java`**:

  - **Purpose**: Creates and prints an adjacency matrix with specific vertex connection rules.
  - **Key Algorithm**: Graph adjacency matrix construction.
  - **Highlights**:
    - Connects vertex 1 to all others.
    - Connects even vertices to greater even vertices.
  - **Example**:
    - Input: `n = 5`
    - Output Matrix:
      ```
      0 0 0 0 0
      1 0 1 1 1
      0 0 0 0 0
      0 0 0 0 0
      0 0 0 0 0
      ```
  - **Application**: Matrix-based graph representations.

- **`PeakElement2D.java`**:
  - **Purpose**: Finds a peak element in a 2D array using a binary search-inspired approach.
  - **Key Algorithm**: Binary Search on Columns.
  - **Highlights**:
    - Identifies a local maximum in a row and column.
    - Optimizes search by dividing the problem space.
  - **Example**:
    - Input Matrix:
      ```
      10  9 15 12
      30 15 14 44
      35 16 32  1
      ```
    - Output: `Peak Element is at: [1, 3]` (row 1, column 3, value 44).
  - **Application**: Optimization problems in multidimensional data.

---

## How to Use

1. Clone the repository:
   ```bash
   git clone <repository-link>
   ```
2. Navigate to the desired file and open it in any Java IDE.
3. Compile and run using:
   ```bash
   javac <filename>.java
   java <filename>
   ```
4. Follow the instructions in each file's `main` method for input and execution.

---

## Contributors

- **Itamar Shapira**
- **Ofir Roditi**

---

Feel free to explore these programs and adapt them for learning or projects!
