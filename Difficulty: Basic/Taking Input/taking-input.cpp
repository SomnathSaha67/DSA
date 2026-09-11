#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    int n;
    float f; // To Store floor of float variable f

    // code here
    getline(cin, s);
    cin>>n>>f;
    
    cout << s << endl;
    cout << n << endl;
    cout << (int)f << endl;
    return 0;
}