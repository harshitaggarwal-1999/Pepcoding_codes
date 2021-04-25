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
        cin >> arr[i];
    }

    unordered_map<pair<int,int> > ourmap;

    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n;j++){
            ll sum = arr[i]+arr[j];

            pair<int,int> temppair;
            temppair.first = i;
            temppair.second = j;

            ourmap.insert({temppair,sum});

        }
    }

}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    ans();
    return 0;
}