#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int testcase ;
    cin >> testcase;
    for(int t = 0; t < testcase; t++){
    	long long d,k;
        cin >> d;
        cin >> k;
        // int k = scn.nextInt();
        int r = sqrt(d);
        vector<int> v;
        for(int i = 0; i <= r; i++){
            v.push_back(i);
        }
        vector< pair<int,int> > ans;
        for(int i = 0; i < v.size(); i++){
            for(int j = i+1; j < v.size(); j++){ //check
                if(((v[i]*v[i]) + (v[j]*v[j])) == d ){//pytho
                    pair<int,int> p1;
                    p1.first = v.at(i);
                    p1.second = v.at(j);
                    ans.push_back(p1);
                }
            }
        }
        long long ansnum  = 0;
        for(int i = 0 ; i < ans.size(); i++){
            pair<int,int> p1 = ans.at(i);
            if(p1.first == 0 || p1.second==0){
                ansnum+=4;
            }else{
                ansnum+=8;
            }

        }
        
        if(ansnum > k)cout << "impossible" << endl;
        else cout << "possible" << endl;
	}
}

