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
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string str;
    cin >> str;

    //  abcdzzcc
    //     |  |   
    // count = 1

    int count = 0;

    int j = 1;

    for(int i = 0; i< str.length()-1; i++){
        if(str.length()== 1){
            break;
        }
        if(str[i]==str[j]){
            j = i+2;
            i-=2;
            count++;
        }else{
            i=j-1;
            j++;
        }
    }
    if(count == 0)cout << "No" << endl;
    else if(count%2 == 0)cout << "No" << endl;
    else cout << "Yes" << endl;
    
}