#include<bits/stdc++.h>
using namespace std;

int main(){
    int n; 
    cin >> n;
    vector<int> numbers;
    for(int i = 1; i <= 2*n; i++){
        int num;
        cin >> num;
        numbers.push_back(num);

    }
    cout << n < endl;
    for(int i = 0; i < n; i++){
        cout << numbers[i] <<endl;
        cout << numbers[n+i] << endl; 
    }


}