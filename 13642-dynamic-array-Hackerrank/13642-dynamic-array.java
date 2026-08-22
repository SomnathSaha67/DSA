import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Initialize n empty lists
        List<List<Integer>> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        arr.add(new ArrayList<Integer>());
    }

    int lastAnswer = 0;
    List<Integer> answers = new ArrayList<>();

    for (List<Integer> query : queries) {

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna