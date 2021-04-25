#include<bits/stdc++.h>
#define ll long long
using namespace std;

int main(){
    int testcases;
    cin  >> testcases;
    while(t--){
        int num;
        cin >> num;

        unordered_map<string, vector<char> > maps;

        for(int i = 0; i < num; i++){
            string s;
            cin >> s;

            char c = s[0];

            maps[s.substr(1)].push_back(c);
            }
            unordered_map<string,vector<char>> :: iterator i1;
            for(i1=maps.begin() ; i1!=maps.end();++i1)
            { 
                sort(i1->second.begin(),i1->second.end());
            }

            unordered_map<string,vector<char>> :: iterator i2;
             ll sum=0;
            for(i1=maps.begin() ; i1!=maps.end();++i1)
            {

                for(i2=i1,++i2; i2!=maps.end();++i2)
                   {

                        int cf=0;   // unique in first
                        for(int i=0;i<i1->second.size();i++)
                        {
                            char ch  = i1->second[i];
                            if(!binary_search(i2->second.begin(),i2->second.end(),ch))cf++;
                        }

                        int d = i1->second.size()-cf;
                        int cs = i2->second.size()-d; 
                        int m = cf * cs * 2;
                        sum+=(ll)(m);
                   }
            }
			
          cout<<sum<<endl;

    }
}