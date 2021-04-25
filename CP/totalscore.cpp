#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    int t;
    cin >> t;
    while(t--){
        ll n,k;
        cin >> n >> k;

        ll* arr = new ll[k];

        for(int i  = 0; i < k; i++){
            cin >> arr[i];
        }
        vector<string> stringvector;
        for(int i = 0; i < n; i++){
            string str;
            cin >> str;
            stringvector.push_back(str);
        }

        for(int i = 0; i < stringvector.size(); i++){
            string str = stringvector[i];
            ll totalscore = 0;

            for(int j = 0; j < str.length(); j++){
                char verdict = str[j];
                if(verdict == '1'){
                    totalscore += (ll) arr[j];
                }
            }

            cout << totalscore << endl;
        }


        delete[] arr;

        
    }
}