import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here
        int sum=0, c=0;
        while (c<=n){
            sum+=c;
            c++;
        }
        System.out.print(sum);
        
        
    }
}