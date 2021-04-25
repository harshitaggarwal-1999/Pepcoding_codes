#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<int,int> p;


int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vector<int> arr(n);
        vector<p> ARR(n);
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
            ARR[i] = {arr[i],i};
        }

        sort(ARR.begin(), ARR.end(),[](const p &fi, const p &se) {
            if(fi.first == se.first)
                return fi.second < se.second;
            else return fi.first > se.first;
        });

        vector<int> finalans(n);
        int totaltime = 0;
        for(int i=0;i<n;i++)
        {
            finalans[ARR[i].second] = ++totaltime;  
        }

        for(int i=0;i<n;i++)
        {
            cout<< finalans[i] <<" ";
        }
        cout<<endl;
    }
}