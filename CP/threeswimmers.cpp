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

        ll leastdif = INT_MAX;
        ll dif = 0;

       cin >> p >> a >> b >> c;
    //    first

       ll closestmul = closestMultiple(p, a);
       

       if(closestmul < p){
           closestmul+=a;
       } 
       

        dif =(ll) closestmul-p;
        
       

       if(dif < leastdif)leastdif = dif;


    //    second

       closestmul = closestMultiple( p, b);
       

       if(closestmul < p){
           closestmul+=b;
       } 
       

        dif =(ll)closestmul-p;

        

       

       if(dif < leastdif)leastdif = (ll)dif;
       cout << "least dif: " << leastdif << endl;

    //    third 

       closestmul = closestMultiple(p, c);
       cout << "closest mul: " << closestmul << endl;
       cout << " p : "<< p <<endl;
       cout << "c " << c << endl;

       if(closestmul < p){
           closestmul+=c;
       } 
       cout << "closest mul: " << closestmul << endl;

        dif =(ll) closestmul-p;
        cout << "dif: " << dif << endl;
       

       if(dif < leastdif)leastdif =(ll) dif;
       cout << "least dif: " << leastdif << endl;

       cout << leastdif << endl;
    
    }
}