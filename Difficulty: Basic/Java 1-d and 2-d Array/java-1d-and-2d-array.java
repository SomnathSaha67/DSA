import java.util.*;

class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
        }

        int maxElement = b[0];
        for (int i = 1; i < n; i++) {
            if (b[i] > maxElement) {
                maxElement = b[i];
            }
        }

        result.add(diagonalSum);
        result.add(maxElement);

        return result;
    }
}
