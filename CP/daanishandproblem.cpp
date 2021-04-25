// you can do it.:)
#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
// #include<bits/stdc++.h>
using namespace std;

typedef long long ll;
void ans(){
    // code here
    int* arr = new int[10];
    for(int i = 0 ; i < 10; i++){
        cin >> arr[i];
    }

    ll k;
    cin >> k;

    // cout << "K:" << k << endl;

    for(int i = 9; i >= 0; i--){
        k=(ll)k-arr[i];
        if(k < 0){cout <<i+1 << endl;break;}
    }
    delete[] arr;
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