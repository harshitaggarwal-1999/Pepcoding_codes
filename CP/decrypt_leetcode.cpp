//leetcode decrypt the string

#include<bits/stdc++.h>
using namespace std;

string freqAlphabets(string str) {
	string output;
	for(int i = 0; i < str.length(); i++){
		
		if(str[i+2] == '#'){
			int asciisum = 0;
			int asciivalue1 = str[i];
			int asciivalue2 = str[i+1];
			if(asciivalue1==49)asciisum = asciivalue1 + asciivalue2 + 9;
            else if(asciivalue1==50)asciisum = asciivalue1 + asciivalue2 + 18;
			char tobeappend = asciisum;
			output += tobeappend;
			i=i+2;
			
		}else{
			int asciivalue = str[i];
			asciivalue += 48;
			
			char tobeappend = asciivalue;
			
			output += tobeappend;
			
			
		}
		
	}
	return output;
        
}

int main(){
	string str = "21#523#12#22#611#71910#721#18#8";
	string ans = freqAlphabets(str);
	cout << ans << endl;
}
