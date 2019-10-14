#include <bits/stdc++.h>
using namespace std;

int main() {
 
    int a[3],b[3],aP = 0,bP = 0;
 
    cin >> a[0] >> a[1] >> a[2] ;
    cin >> b[0] >> b[1] >> b[2] ;
 
    for(int i = 0; i < 3; i++){
        if(a[i] > b[i])
            aP++;
        else if(a[i] < b[i])
            bP++;
    }
    cout << aP << " " << bP << endl;
    return 0;
}
