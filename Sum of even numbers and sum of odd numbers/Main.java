#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int odd=0,even=0;
  for(int i=0;i<n;i++){
    int g;
    cin>>g;
    if(abs(g)%2!=0)
      odd+=g;
    else
      even+=g;
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\n";
    cout<<"The sum of the odd numbers in the array is "<<odd;
}