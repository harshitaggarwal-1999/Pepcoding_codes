#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){

        int n ;
        int* arr = new int[n];
        bool isbeautiful = true;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i]%arr[j] != 0 || arr[j]%arr[i] != 0){
                    isbeautiful = false;
                    break;
                }
            }
        }
        if(isbeautiful){
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
}