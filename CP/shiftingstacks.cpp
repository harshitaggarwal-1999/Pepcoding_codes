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

    ll sum  = 0;
    bool  flag  = true;
    for(ll i = 0 ; i < n; i++){
        ll num;
        cin >> num;

        sum+= num;
        ll minsum=(i*(i+1))/2;
        // cout <<"Minsum : " << minsum << endl;
        if(sum < minsum){
            flag = false;
        }
    }

    
    if(flag)cout << "YES" << endl;
    else cout << "NO" << endl;
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