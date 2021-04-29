#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){    
        int n;
        cin >> n; 
        int first = 0,second = 0;
        while(n--){
            int a  = 0;
            cin >> a;
            if(a == 1){
                first++;
            }else {
                second++;
            }
        }
        if( first%2 != 0){
            cout << "NO" << endl;
        }else if (first == 0 && second%2 != 0)
        {
            cout << "NO" << endl;
        }else{
            cout << "YES" << endl;
        }
    
    }
}
