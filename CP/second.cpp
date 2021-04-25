#include<iostream>
#include<vector>
// #include<algorithm>
// #include<queue>
// #include<cmath>
// #include<iomanip>
// #include<unordered_set>
// #include<unordered_map>

// #define pb push_back

using namespace std;

// typedef long long ll;
// typedef unsigned long long ull;
// typedef pair<int,int> pii;

void solve()
{
    int n,q;
    cin>>n>>q;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    for(int i=0;i<q;i++)
    {
        int type;
        cin>>type;
        if(type == 0)
        {
            int index, val;
            cin>>index>>val;
            arr[--index] = val;
            continue;
        }

        int index, jump = 0, lastIndex;
        cin>>index;
        --index;
        while(index<n)
        {
            lastIndex = index;
            ++jump;
            index += arr[index];
        }

        cout<<lastIndex+1<<" "<<jump<<"\n";
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    // int t;
    // cin >> t;
    // while (t--)
    // {
        solve();
    // }

    return 0;
}
