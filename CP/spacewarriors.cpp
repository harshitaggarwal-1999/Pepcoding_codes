#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while(t--){
        int xcoor,ycoor;
        cin >> xcoor >> ycoor;

        string turns;
        cin >> turns;

        int Dcount = 0;
        int Lcount = 0;
        int Rcount = 0;
        int Ucount = 0;

        for(int i = 0; i < turns.length(); i++){
            if(turns[i] == 'R'){
                Rcount++;
            }else if(turns[i] == 'D'){
                Dcount--;
            }else if(turns[i] == 'L'){
                Lcount--;
            }else if(turns[i] == 'U'){
                Ucount++;
            }
        }
        bool reachable = true;
        if(ycoor < 0 && Dcount > ycoor){
            reachable = false;
        }else if(ycoor > 0 && Ucount < ycoor){
            reachable = false;
        }

        if(xcoor < 0 && Lcount > xcoor){
            reachable = false;
        }else if(xcoor > 0 && Rcount < xcoor){
            reachable = false;
        }

        if(reachable)cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}

