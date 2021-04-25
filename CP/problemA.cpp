#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        long long n;
        cin >> n;
        bool isdivisibleby2 = true;
        while(n > 1){
            if(n%2 != 0){
                isdivisibleby2 = false;
                break;
            }
            n = (long long)n/2;
            // cout <<"n: " << n << endl;
        }
        if(!isdivisibleby2){
            cout << "YES" << endl;
        }
        else {
            cout << "NO" << endl;
        }
    }
}