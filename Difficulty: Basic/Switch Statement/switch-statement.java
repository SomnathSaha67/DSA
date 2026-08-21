import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        switch (n){
            case 1->System.out.print("One");
            case 2->System.out.print("Two");
            case 3->System.out.print("Three");
            case 4->System.out.print("Four");
            case 5->System.out.print("Five");
            case 6->System.out.print("Six");
            case 7->System.out.print("Seven");
            case 8->System.out.print("Eight");
            case 9->System.out.print("Nine");
            default->System.out.print("Unknown");
        }
        sc.close();
    }
}
