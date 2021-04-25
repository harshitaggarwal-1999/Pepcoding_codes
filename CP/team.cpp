// you can do it.:)
#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
// #include<bits/stdc++.h>
using namespace std;

// typedef long long ll
void ans(){
    // code here
    int n;
    cin >> n;

    int num = 0;

    for(int i = 0; i < n; i++){
        int agree = 0;
        for(int j = 0; j < 3; j++){
            int point;
            cin >> point;

            if(point == 1)agree++;
        }

        if(agree >= 2)num++;

    }

    cout << num << endl;

}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    ans();
    return 0;
}