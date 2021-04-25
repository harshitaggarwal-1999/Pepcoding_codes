// you can do it.:)
#include<iostream>
// #include<algorithm>
#include<string>
// #include<unordered_maps>
// #include<climit>
// #include<bits/stdc++.h>
using namespace std;

void ans(){
    // code here
    string str;
    cin >> str;

    if(str.length() <11)cout << str << endl;
    else {
        string ans;
        
        char start = str[0];
        char end = str[str.length()-1];

        cout << start << str.length()-2 << end << endl;
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