#include<iostream>
using namespace std;
int main()
{
int n,i,m=0,flag=0;
cin>>n;
m=n/2;
if(n==1)
{
cout<<"Not eligible";
flag=1;
}
else
{
for(i=2;i<=m;i++)
{
if(n%i==0&&n*1==n)
{
cout<<"Not eligible";
flag=1;
break;
}
}
}
if(flag==0)
{
cout<<"Eligible";
}
return 0;
}