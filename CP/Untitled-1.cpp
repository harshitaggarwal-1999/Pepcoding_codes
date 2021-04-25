#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    char* c = new char[n];
    for (int i = 0; i < n; i++){
        cin >> c[i];
    }
    if (c[0] == 'H' && c[1] == 'H'){
        cout << "NO";
    }
    else{
        cout << "YES";
        for(int i = 0; i < n; i++) {
            if(c[i] == '.'){
                c[i] = 'B';
            }
        }
        for(int i = 0; i < n; i++) {
            cout << c[i];
        }
    }
    

}