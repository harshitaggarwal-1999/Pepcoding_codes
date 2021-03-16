// you can do it.:)
// #include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
void ans(){
    // code here
    int n;
    cin >> n;

    vector<int> arr(n);

    for(int i = 0; i < n; i++){
        // int num;
        // cin >> num;
        // arr.push_back(num);

        cin >> arr[i];
    }

    vector<int> output(n,0);

    int temp = arr[n-1];
    for(int i = n-1; i >=0; i--){
        temp = max(temp,arr[i]);
        if(temp!= 0){
            output[i] = 1; 
        }
        temp--;
    }

    // display
    for(int i = 0; i < n; i++){
        cout << output[i] <<" ";
    }
    cout << endl;
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