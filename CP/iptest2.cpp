#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<bits/stdc++.h>
using namespace std;


int main() {
    long long sn,sb,db;
    cin >> sn >> sb >> db;
    long long currnum = sn;
    long long sum = 0;
    int power = 0;
    while(currnum > 0){
    	int remainder = currnum%10;
    	sum = (long long)sum + (long long)remainder*pow(sb,power);
    	currnum = currnum /10;
    	power++;
	}
	
    
    long long base10 = sum;
    long long num = base10;
    long long dividend = num;
    int divisor = db;
    
    int ansarr[32];
    int ind = 0;
    
    
    while(dividend > 0){
    	long long quotient = dividend/divisor;
    	ansarr[ind] = dividend%divisor;
    	
    	
    	
    	dividend = quotient;
    	ind++;
    	
    	
	}
	long long ans = 0;
	for(int i = ind-1; i >= 0; i--){
		ans = (long long)ans*10+ansarr[i];
	}
	cout << ans;
}

