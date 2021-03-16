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
    vector<pair<int,int> > exptimings;
    pair<int,int> least = {0,0};
    exptimings.push_back(least);

    for(int i = 0; i < n; i++){
        pair<int,int> eachscdl;
        cin >> eachscdl.first;
        cin >> eachscdl.second;
        exptimings.push_back(eachscdl);
    }

    int* tm = new int[n];
    for(int i =0 ; i < n; i++){
        cin >> tm[i];
    }
    pair<int,int> prevactualpair = {0,0};
    for(int i = 1; i < exptimings.size(); i++){
        pair<int, int> currpair = exptimings[i];
        int tempsecd = ceil((double)((double)currpair.second-(double)currpair.first)/2);
        currpair.first = prevactualpair.second+(currpair.first-exptimings[i-1].second+tm[i-1]);
        currpair.second = currpair.first+tempsecd;    
        if(currpair.second<exptimings[i].second){
            currpair.second += exptimings[i].second-currpair.second;
        }
        prevactualpair = currpair;
    }

    cout << prevactualpair.first << endl;
    
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