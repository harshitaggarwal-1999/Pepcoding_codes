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
    int amin,bmin,cmin,tmin,a,b,c;
    cin >> amin >> bmin >> cmin >> tmin >> a >> b >> c;
    if(a >= amin &&c >= cmin && b>= bmin && a+b+c >= tmin){
        cout << "YES" << endl;
    }else{
        cout << "NO" << endl;
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