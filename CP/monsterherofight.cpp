#include<bits/stdc++.h>
using namespace std;

typedef long long int lli;

void solve(){
	
	lli heroattack, herohealth, n;
	cin >> heroattack >> herohealth >> n;
	
	
	
	vector<pair<lli, lli> > monster(n);
	
	
	for(int i = 0; i < n; i++){
		cin >> monster[i].first;			
	}
	
	for(int i = 0; i < n; i++){
		cin >> monster[i].second;			
	}
	
	sort(monster.begin(), monster.end());
	

	for(int i = 0; i < n; i++){
		if(herohealth <= 0){
			cout << "NO" << endl;
			return;
		}
		
		lli numofmatcheshero =(lli) herohealth/monster[i].first;
		lli remofheromatch = (lli)herohealth%monster[i].first;
		if(remofheromatch) numofmatcheshero++;
		
		lli numofmatchesmonster = (lli)monster[i].second/heroattack;
		lli remofmonstermatch = (lli)monster[i].second%heroattack;
		if(remofmonstermatch) numofmatchesmonster++;
			
		lli totalmatches =(lli) min(numofmatcheshero, numofmatchesmonster);
		
		monster[i].second -=(lli) totalmatches*heroattack;
		
		herohealth -=(lli) totalmatches*monster[i].first;
		
		

		
	}
	
	if(monster[n-1].second > 0){
		cout << "NO" << endl;
		
	}else{
		cout << "YES" << endl;
	}

}

int main(){
    
	int t;
	cin >> t;
	
	while(t--){
		solve();	
	}
}
