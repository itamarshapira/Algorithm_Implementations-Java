//Itamar Shapira : 315387902
//Ofir Roditi : 208647297
public class Minimum_Insertions_to_Make_String_Palindrome {

    // Function to find the Longest Common Subsequence (LCS) between two strings
    public static int lcs(String s1, String s2)
    {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1]; // Create a 2D array to store LCS lengths

        // Fill the dp table
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // If characters match, increment LCS length
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // If characters don't match, take max of previous LCS lengths
                }
            }
        }
        return dp[m][n]; // Return the longest length of LCS
    }

    // Function to reverse a string
    public static String reverse(String s) {
        // Convert the string to a StringBuilder
        StringBuilder sb = new StringBuilder(s);

        // Reverse the characters
        sb.reverse();

        // Convert the StringBuilder back to a string
        return sb.toString();
    }

    // Function to calculate the minimum characters required to make a string a palindrome
    public static int minCharToPolindrom(int longestPol, int originalS1Size)
    {
        return originalS1Size - longestPol; // Return the difference between original size and length of LCS
    }

    public static void main(String[] args)
    {
        String s1 = "ab3bd";
        String s2 = reverse(s1); // Reverse the original string

        // Find the length of the longest common subsequence
        int longestPolLCS = lcs(s1, s2);

        // Calculate and print the minimum characters required to make the string a palindrome
        int finalAns = minCharToPolindrom(longestPolLCS, s1.length());
        System.out.println(finalAns);
    }
}