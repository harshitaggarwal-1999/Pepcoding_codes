#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin >> t;
	
	while(t--){
		int n;
		cin >> n;
		vector<pair<int, int> > arr;

		for(int i = 0; i < n; i++){
			pair<int, int> p;
			cin >> p.first;
			
			arr.push_back(p);
		}
		
		for(int i = 0; i < n; i++){
			cin >> arr[i].second;
		}
		
		int previdx = 0;

		
		for(int i = 0; i < n; i++){
			if(arr[i].first == 1) {
				previdx = i;
				break;
			}	
		}
		
		int hits = 0;		
		
		for(int i = 2; i <= n; i++){
			for(int j = 0; j < n; j++){
				if(arr[j].first == i){
					int curridx = j;
					
					
					int diffrence = previdx - curridx;
					
					if(diffrence > 0){
						
						hits += (diffrence/arr[j].second)+1;
						previdx = curridx + arr[j].second*((diffrence/arr[j].second)+1);
						
					}

					else if (diffrence == 0){
						hits++;
						previdx = curridx + arr[j].second;
					}
					
					else previdx = curridx;
					
					break;
					
					
				}
			}
		}
		
		cout << hits << endl;
	}
}
