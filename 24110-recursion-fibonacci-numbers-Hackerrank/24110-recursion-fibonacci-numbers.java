import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       if (n==0){
        System.out.print(0);
       }if (n==1)
            System.out.print(1);
        int first=0, second=1;
        for (int i=2; i<=n;i++){
            int temp= second;
            second= first+second;
            first= temp;
        }
        System.out.print(second);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna