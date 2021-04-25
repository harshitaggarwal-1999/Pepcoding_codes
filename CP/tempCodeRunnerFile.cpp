#include<bits/stdc++.h>


using namespace std;

typedef long long ll;

int closestMultiple(ll n, ll x) 
{    
    if(x>n) 
       return x; 
  
    n = n + x/2; 
    n = n - (n%x); 
    return n; 
}


int main(){

    
    int t;
    cin >> t;

    while(t--){
        ll p;
        ll a;
        ll b;
        ll c;

        ll leastdif = INT64_MAX;
        ll dif = 0;

       cin >> p >> a >> b >> c;
    //    first     

       if(a< p){
           a = a +((p/a)+1);
       }      

        dif  = a-p;

       leastdif = min(leastdif,dif);

    //    second

        if(b < p){
           b = b +((p/b)+1);
       }      

        dif  = b-p;

       leastdif = min(leastdif,dif);
       

    //    third 

        if(c < p){
           c = c +((p/c)+1);
       }      

        dif  = c-p;

       leastdif = min(leastdif,dif);
    
       cout << leastdif << endl;
    
    }
}