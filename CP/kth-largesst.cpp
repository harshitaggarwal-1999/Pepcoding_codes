// you can do it.:)
// #include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n,q;
    cin >> n >> q;

    int* arr = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
        if(arr[i] == 1)count++;
    }

    for(int i = 0; i < q; i++){
        int t,val;
        
        cin >> t >> val;

        if(t==1){
            int x = val-1;
            int prevnum = arr[x];
            arr[x] = 1-arr[x];
            
            if(prevnum == 1)count--;
            else{
                count++;
            }
            
            
            

        }else {
            if(val > count)cout << 0 << endl;
            else cout << 1 << endl;
        }
    }

    delete[] arr;
    
    
}