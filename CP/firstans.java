#include<bits/stdc++.h>
using namespace std;



typedef long long lli;
typedef first ff;
typedef second ss;

char arr[1001000];

int main() {

    cin >> arr;

    lli len = strlen(arr);

    lli k;
    cin >> k;
    int f = 0;
    lli pp = 0;
    for (int i = 0; i < len; i++) {

      if (arr[i] == '(') pp++;

      else pp--;

      if (pp < 0){
        f = 1;
        break;
      }

    }

    if ((f == 1 || pp > 0) && k == 1) {
      cout << arr << endl;
      continue;

    } else if ((f == 1 || pp > 0) && k > 1){
      cout << "-1" << endl;
      continue;
    } else{

      lli count = 0;

      lli place = 0;
      f = 0;
      for (int i = 1; i < len; i++)
      {
        if (arr[i] == ')' && arr[i - 1] != ')') count++;
        if (count == k){
          place = i;
          f = 1;
          break;
        }

      }

      if (f == 0)

        for (int i = len - 2; i >= 0; i--) {

        if (arr[i] == '(' && arr[i + 1] != '(') count++;
        if (count == k)
        {
          place = i; 
          f = 1;
          break;
        }

      }

      if (f == 0) cout << "-1" << endl;
      else{
        for (int i = 0; i < len; i++) {
          if (i != place) cout << arr[i];
        }
        cout << endl;
      }
    }
  }

}