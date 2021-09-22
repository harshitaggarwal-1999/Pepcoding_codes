#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,s;
    cin >> n >> s;
    int sum = (n*(n+1))/2;

    sum =sum-s;
    if(sum >= 1 && sum <= n){
        cout << sum << endl;
    }else{
        cout << -1 << endl;
    }
}