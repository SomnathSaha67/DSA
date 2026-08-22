int search(int arr[], int n, int x) {
    // Code here
    for (int i=0; i<n; i++){
        if (arr[i]==x){
            return i;
        }
    }
    return -1;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna