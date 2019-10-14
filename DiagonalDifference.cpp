#include<iostream>

using namespace std;
int main(){
    int i,j, n, arr[102][102],d1=0,d2=0;
    cin>>n;
    for (i=0;i<n;i++){
        for(j=0;j<n;j++){
            cin>>arr[i][j];
             if(i==j)
                 d1+=arr[i][j];
            if(i+j==n-1)
                d2+=arr[i][j];
        }
        }
    cout << abs(d2-d1) << endl;
    return 0;
}
