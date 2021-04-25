#include<iostream>
#include<vector>

using namespace std;

bool isPrime(int n)
{
    if (n <= 1)
        return false;
 
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;
 
    return true;
}



vector<int> createprime()
{

    long n = 1000000;
    vector<bool> arr(n + 1, true); 
    arr[0] = arr[1] = false;

    for (long i = 2; i * i <= n; i++) 
    {
        if (arr[i])
        {
            for (long j = i * i; j <= n; j += i)
                arr[j] = 0;
        }
    }
    vector<int> primes;
    for (int i = 2; i < arr.size(); i++)
    {
        if (arr[i])
        {
            primes.push_back(i);
        }
    }
    return primes;
}

int main()
{   
    vector<int> primes = createprime();
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin>>n;
        if(n<=4)    
        {
            cout<< 0 << endl;
            continue;
        }
        bool isnotdone = true;
        int count = 0;
        int idx  = 1;
        while(isnotdone){
            
            int num = primes[0]+primes[idx];
            bool check = isPrime(num);
            if(primes[idx] >= n)isnotdone = false;
            if(check && num <= n){
                count++;
                
            }
            idx++;
        }
        cout << count << endl;

    }
}