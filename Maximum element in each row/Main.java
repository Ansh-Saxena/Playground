#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  for(int i=0;i<m;i++){
    int max=0;
  for(int j=0;j<n;j++){
    int temp;
    cin>>temp;
    if(temp>max)
      max=temp;
  }
  cout<<max<<"\n";
}
}