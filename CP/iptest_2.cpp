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
        int i = 0;
        int j = r;
        while(i < j){
        	long long num1 =  v[i] * (long long)v[i];
        	long long num2 =  v[j] * (long long)v[j];
        	long long sum  = num1+num2;
        	
        	if(sum == d ){//pytho
                    pair<int,int> p1;
                    p1.first = v.at(i);
                    p1.second = v.at(j);
                    ans.push_back(p1);
                    
                i++;
                j--;
                } else if(sum < d){
                	i++;
				}else{
					j--;
				}
                
		}
		for(int i = 0; i <= r; i++){
			long long num1 =  v[i] * (long long)v[i];
//        	long long num2 =  v[j] * (long long)v[j];
        	long long sum  = num1*2;
        	
        	if(sum == d ){//pytho
                    pair<int,int> p1;
                    p1.first = v.at(i);
                    p1.second = v.at(j);
                    ans.push_back(p1);
                    
               
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

