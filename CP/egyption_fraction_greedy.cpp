#include<bits/stdc++.h>
using namespace std;

void egyptionfraction(pair<int,int> p){
    while(p.first != 0){
        double div= (double)p.second/p.first;
        int dr = ceil(div);
        pair<int,int> unitfrctn;
        unitfrctn.first = 1;
        unitfrctn.second = dr;

        cout << unitfrctn.first <<"/"<<unitfrctn.second<<" + ";

        p.first = (p.first*dr)-(p.second);
        p.second = (p.second*dr);



    }

    cout << 0 << endl;
    

}

int main(){
    pair<int,int> p;
    cin >> p.first;
    cin >> p.second;

    egyptionfraction(p);
}