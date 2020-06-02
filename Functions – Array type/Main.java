#include<iostream>
using namespace std;
int main()
{
  int n;
    cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
    int odd=0,even=0;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++){
    cin>>arr[i];
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  if(odd==0 && even!=0)
    cout<<"The array is Even";
  else if(odd!=0 && even==0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}