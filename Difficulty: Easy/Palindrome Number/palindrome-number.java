class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int original;
        if (n<0) {original= Math.abs(n);}
        else {original= n;}
        int temp= 0;
        while(original>0){
            int lastDigit= original%10;
            temp= (temp*10)+lastDigit;
            original= original/10;
        }
        return Math.abs(n)==temp;
    }
}