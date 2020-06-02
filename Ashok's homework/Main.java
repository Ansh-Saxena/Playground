#include<iostream>
using namespace std;
int main()
{
  int a[50][50],b[50][50],i,j,r,c;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>b[i][j];
    }
  }
  int d[50][50];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      d[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cout<<d[i][j]<<" ";
    }
    cout<<endl;
  }
}