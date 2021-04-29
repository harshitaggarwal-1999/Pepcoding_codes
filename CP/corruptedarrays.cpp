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
    int n;
    cin >> n;
    ll arr[n+2];

    for(int i = 0; i < n+2; i++){
        cin >> arr[i];
    } 
    sort(arr,arr+n+2);
    
    ll sum = 0;
    // calculate sum
    for(int i = 0; i < n+1; i++){
        sum += arr[i];
    }

    int i = 0;
    while(i < n+1){
        if(sum-arr[i] == arr[n+1]){
            for(int idx = 0; idx < n+1; idx++){
                if(idx == i)continue;
                cout << arr[idx] <<" ";
            }
            cout << endl;
            return;
        }
        i++;
    }
    // i=n+1
    sum -= arr[i-1];
    if(sum == arr[i-1]){
        for(int i = 0; i < n; i++){
            cout << arr[i] << " ";
            
        }
        cout << endl;
        return;
    }

    cout << -1 << endl;
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