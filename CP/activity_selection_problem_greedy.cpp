#include <bits/stdc++.h>

using namespace std;

int maxMeetings(int *, int *, int);

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int start[n], end[n];
        for (int i = 0; i < n; i++) cin >> start[i];

        for (int i = 0; i < n; i++) cin >> end[i];

        int ans = maxMeetings(start, end, n);
        cout << ans << endl;
    }
    return 0;
}


bool cmp(pair<int,int> p1, pair<int,int> p2) {
    return p1.second < p2.second;
}

int maxMeetings(int start[], int end[], int n) {
    
    vector<pair<int,int> > activities;
    for(int i = 0; i < n; i++){
        pair<int,int> p;
        p.first = start[i];
        p.second = end[i];
        
        activities.push_back(p);
        
        
    }
    
    if(activities.size() == 1)return 1;
    sort(activities.begin(), activities.end(),cmp);

    int i = 1;
    int j = 0;
    int count = 0;

    for(; i < activities.size(); i++){
        if(count == 0)count++;
        if(activities[i].first>=activities[j].second){
            count++;
            j=i;
        }
    }
    return count;
     
}
