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
    int[][] arr = new int[9][15];
    for(int i = 0; i < 9; i++){
        int num = 2050;
        for(int j = 0; j < 15; i++){
            arr[i][j] = num*(j+1);
        }
        num*=10;
    }

    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 15; j++){
            cout << arr[i][j] << " ";
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