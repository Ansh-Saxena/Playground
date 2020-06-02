#include<iostream>
using namespace std;
int pow(int,int);
int main()
{
  int a,b,c;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>b;
  c=pow(a,b);
  cout<<"\nThe value of "<<a<<" power "<<b<<" is "<<c;
}
int pow(int x,int y)
{
  if(y!=0)
    return (x*pow(x,y-1));
  else
    return 1;
}