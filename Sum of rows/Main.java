#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  for(int i=0;i<m;i++){
    int temp=0;
    for(int j=0;j<n;j++){
      int a;
      cin>>a;
      temp+=a;
    }
    cout<<temp<<"\n";
  }
}