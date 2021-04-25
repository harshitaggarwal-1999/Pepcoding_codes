#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int fact(int x){
    if(x== 0){
        return 1;
    }
    int smallans = fact(x-1);
    return x+smallans;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n;
    cin >> n;
    vector<int> v;
    v.push_back(0);
    v.push_back(1);
    int sum = 0;
    int x = 0;
    int y = 1;
    for(int i = 2; i < fact(n);i++){
        sum = x+y;
        x= y;
        y = sum;
        
        v.push_back(sum);        
    }
////    checking fibonaci
//	for(int i = 0; i < v.size(); i++){
//		cout << v[i] << " ";
//	}
    int index = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < i+1; j++){
            cout << v[index] << " ";
            index++;
        }
        cout << endl;
    }
//    return 0;
}

