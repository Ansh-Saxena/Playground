#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int max=0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      int g;
      cin>>g;
      if(g>max)
        max=g;}}
  cout<<"The maximum element is "<<max;
}