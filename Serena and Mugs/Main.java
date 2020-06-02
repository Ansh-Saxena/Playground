#include<iostream>
using namespace std;
int main()
{
  int n,s;
  cin>>n>>s;
  int arr[n],temp=0;
  for(int i=0;i<n;i++){
    cin>>arr[i];
    temp+=arr[i];
  }
  if(temp>s)
    cout<<"NO";
  else
    cout<<"YES"; 
}