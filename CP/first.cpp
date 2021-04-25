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
    int n,k;
    if(k > (n-1)/2)cout << -1 << endl;
    else{
        int[] arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = i+1;
        }

        for(int i = n-1; i >= 2; i=-2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        for(int i = 0 ; i < n; i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }

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