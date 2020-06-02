#include<iostream>
using namespace std;
int main()
{
int n,rev=0,r;
cin>>n;
while(n!=0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
cout<<rev;
return 0;
}