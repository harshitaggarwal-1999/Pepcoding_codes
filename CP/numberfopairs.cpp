#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n ,l,r;
    cin >> n >> l >> r;
    for(int i  = 0 ; i < n; i++){
        cin >> arr[i];
    }

    sort(arr, arr+n);

    int pairnum = 0;
    for(int i = 0; i < n; i++){
        int num = arr[i];
        int findingnum1 = l-arr[i];
        int findingnum2 = r-arr[i];

        int startidx = upper_bound(arr,arr+n,findingnum1);
        int endidx = lower_bound(arr,arr+n, findingnum2);

        pairnum += ((endidx-startidx)+1);
    }

    cout<<pairnum<< endl;

}

int main(){
    int t;
    cin >> t;
    
    while(t--){
        solve()
    }
}