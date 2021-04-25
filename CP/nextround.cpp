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

    int n, k;
    cin >> n >> k;

    int* arr = new int[n];

    for(int i = 0 ; i < n; i++){
        cin >> arr[i];
    }

    int score = arr[k-1];
    int passers = 0;
    int maxnum = 0;

    for(int i = 0 ; i < n; i++){
        if(arr[i] > maxnum)maxnum = arr[i];
        if(arr[i] >= score){
            
            passers++;
        }
        else if(arr[i] < score)break;
    }

    if(maxnum == 0)cout << 0 << endl;
    else cout << passers << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    ans();
    return 0;
}