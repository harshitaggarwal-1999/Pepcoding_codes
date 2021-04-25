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
    n = n+2;
    ll arr[n];

    for (int i = 0; i < n; i++)
    {
        /* code */
        cin >> arr[i];
    }

    sort(arr,arr+n);

    // 2 2 3 7 12
    // 1 1 1 1 2 4
    int idx = 0;
    for(int i = n-2; i>= n-3; i--){
        ll val =(ll) arr[i+1];
        ll ans[n-2];
        idx = 0;
        for(int j = i; j > -1 && idx < n-2; j--){
            if(val-arr[j] < 0){
                continue;
            }
            ans[idx] = arr[j];
            val -=(ll) arr[j];
            idx++;
            if(val == 0 && idx == n-2){
                for(int m = 0; m < idx; m++){
                    cout << ans[m] <<" ";
                }
                cout << endl;
                return;
            }
            if(val < 0){
                break;
            }
        }
    }
    cout << -1 << endl;
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