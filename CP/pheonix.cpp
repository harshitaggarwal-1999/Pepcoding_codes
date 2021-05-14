// you can do it.:)
#include<bits/stdc++.h>
//#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
using namespace std;

typedef long long ll;
void ans(){
    // code here
    ll num;
    cin >> num;

    if(n == 0){
        yn(0);
        return;
    }
    if(n%2 != 0){
        yn(0);
        return;
    }

    for(int i = 0; i <= 40; i++){
        ll num = (long)pow(2,i);
        
        if(num-n == 0){
            yn(1);
            return;
        }
    }

    for(int i = 0; i < 10000; i++){
        ll num = (long)2*(i*i);
        // System.out.println(num+" "+ n);

        if(num == n){
            yn(1);
            return;
        }
    }

    for(int i = 0; i < 10000; i++){
        ll nume = (long)4*(i*i);
        // System.out.println(nume+" "+ n);

        if(nume == n){
            yn(1);
            return;
        }
    }
    yn(0);
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