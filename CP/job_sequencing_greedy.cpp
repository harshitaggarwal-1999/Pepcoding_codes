#include<bits/stdc++.h>
using namespace std;

struct job
{
    /* data */
    char id;
    int deadline;
    int profit;
};
bool  cmp(job j1, job j2){
    return j1.profit>j2.profit;
}
vector<char> jobsequencing(vector<job> jobarr){

    sort(jobarr.begin(), jobarr.end(), cmp);

    bool arr[jobarr.size()];
    for(int i = 0; i < jobarr.size(); i++){
        arr[i] = false;
    }
    int n  = jobarr.size();
    vector<char> ans;
    for(int i = 0; i < jobarr.size(); i++){
        for(int j = min(n, jobarr[i].deadline)-1; j>=0; j--){
            if(arr[j] == false){
                ans.push_back(jobarr[i].id);
                arr[j] = true;
                break;
            }
        }
    }

    for(int i = 0; i < ans.size(); i++){
        cout << ans[i] << endl;
    }
    return ans;
}




int main(){
    int n;
    cin >> n;
    vector<job> jobarr;
    for(int i = 0; i < n; i++){
        job j1;
        cout << "enter the Id of " << i+1 << "st : ";
        cin >> j1.id;
        cout << "\n";

        cout << "enter the deadline of " << i+1 << "st : ";
        cin >> j1.deadline;
        cout << "\n";

        cout << "enter the profit of " << i+1 << "st : ";
        cin >> j1.profit;
        cout << "\n";

        jobarr.push_back(j1);

         
    }
    jobsequencing(jobarr);
}