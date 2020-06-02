#include<iostream>
using namespace std;
int main()
{
  int n,arr[50],a,i,f=0;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>arr[i];
  cin>>a;
  for(i=0;i<n;i++)
  {
    if(arr[i]==a)
       {
         f=1;
         break;
       }
  }
  if(f==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}