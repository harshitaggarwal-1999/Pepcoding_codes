#include<bits/stdc++.h>
using namespace std;

int main(){
    int x,n;
    cin >> x >> n;
    vector<int> carsposition(n);
    vector<int> speedofcars(n);
    vector<int> checkpoints(x);
    for(int i = 0; i < x; i++){
        cin >> checkpoints[i];
    }
    for(int i = 0; i < n; i++){
        cin >> carsposition[i];
    }
    for(int i = 0; i < n; i++){
        cin >> speedofcars[i];
    }

    vector<pair<int,int> > pairarr(n);
    for(int i = 0 ;i < n; i++){
        pair<int,int> p(carsposition[i],speedofcars[i]);
        pairarr[i]= p;
    }

    sort(pairarr.begin(), pairarr.end());

    for(int i = 0; i < n; i++){
        cout << pairarr[i].first <<"     "<< pairarr[i].second;
    }
}