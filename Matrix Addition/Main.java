#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int one[r][c],two[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>one[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>two[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cout<<one[i][j]+two[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  
}
