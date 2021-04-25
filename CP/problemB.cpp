#include<bits/stdc++.h>
using namespace std;

int main(){
    int t; 
    cin >> t;
    while (t--){
        int n;
        cin >> n;
        int rem = n%2020;
        int count = 0;

        while(n>=2020){
            n = n-2020;
            count++;
        }

        if(rem <= count)cout << "YES" << endl;
        else cout << "NO" << endl;


    }
}