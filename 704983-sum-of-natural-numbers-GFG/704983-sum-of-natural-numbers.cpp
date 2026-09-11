#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int sum=0;

    // code here
    for (int i= 1; i<=n; i++){
        sum+=i;        
    }
    
    cout<<sum<<endl;

    return 0;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna