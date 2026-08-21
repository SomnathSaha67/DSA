import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for (int i=0; i<n; i++){
            int d= sc.nextInt();
            ArrayList<Integer> inner= new ArrayList<>();
            for (int j=0; j<d; j++){
                inner.add(sc.nextInt());
            }
            arr.add(inner);
        }
        int q= sc.nextInt();
        for (int i=0; i<q; i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            try{
                System.out.println(arr.get(x-1).get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna