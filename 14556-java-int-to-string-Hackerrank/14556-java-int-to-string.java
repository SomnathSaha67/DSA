import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s= String.valueOf(n);
        if (-100<=n && 100>=n){
            if (n==Integer.parseInt(s)){
                System.out.print("Good job");
            }
        }else{
            System.out.print("Wrong answer");
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna