// you can do it.:)
#include<bits/stdc++.h>
//#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
using namespace std;

typedef long long ll;
void ans(){
    // code here
    ll n;
    cin >> n;

    if(n%2050!= 0){
        cout << -1 << endl;
        return;
    }

    n = n/2050;
    int sum  = 0;
    while(n != 0){
        sum += n%10;
        n = n/10;
    } 
    cout << sum << endl;
    return;
    

}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;
    while(t--){
        ans();

    }
    return 0;
}