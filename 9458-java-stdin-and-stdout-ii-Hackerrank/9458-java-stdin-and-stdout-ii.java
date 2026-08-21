import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
Scanner sc= new Scanner(System.in);
System.out.println("");
int n= sc.nextInt();
if (1<=n && n<=100){
    if (n%2!=0){
        System.out.print("Weird");
    }else if (n%2==0 && (2<=n && n<=5)){
        System.out.print("Not Weird");
    }else if (n%2==0 && (6<=n && n<=20)){
        System.out.print("Weird");
    }else{
        System.out.print("Not Weird");
    }
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna