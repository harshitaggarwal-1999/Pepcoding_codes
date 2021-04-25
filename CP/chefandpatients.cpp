#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;

        int*  arr = new int[n];
        priority_queue<int> pq;

        for(int i = 0; i < n; i++){
            cin >> arr[i];
            pq.push(arr[i]);
        }

        vector<int> sortedq;

        while(!pq.empty()){
            sortedq.push_back(pq.top());
            pq.pop();
        }
        
        


        
        
        
        delete[] arr;
    }
}