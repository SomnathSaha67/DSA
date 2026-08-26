class Solution {
    public void bubbleSort(int[] arr) {
        // code here\
        boolean swapped;
        for (int i=0; i<arr.length-1; i++){
            swapped=false;
            for (int j=1; j<arr.length-i; j++){
                if (arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped= true;
                }
            }
            if (!swapped)
                break;
        }
    }
}