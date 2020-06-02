#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int arr[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++)
      cin>>arr[i][j];
  }
  int rowu=0,rowd=0;
  for(int i=0;i<n;i++)
    rowu+=arr[0][i];
   for(int i=0;i<n;i++)
    rowd+=arr[m-1][i];
  int diag=0;
  int y=n;
  for(int i=0;i<m;i++){
      diag+=arr[i][--y];
  }
 //cout<<rowu<<"\n"<<rowd<<"\n"<<diag<<"\n";
  int total=rowu+rowd+diag-arr[0][n-1]-arr[m-1][0];
  cout<<"Sum of Zig-Zag pattern is "<<total;
  
}