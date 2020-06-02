#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,n4,s=0,g=0,y;
  cin>>n1>>n2>>n3>>n4;
  if(n1<n2&&n1<n3)
    s=n1;
  else if(n2<n1 && n2<n3)
    s=n2;
  else
    s=n3;
  while(s>=1)
  {
    if((n1%s==0)&& (n2%s==0) && (n3%s==0))
    {
      g=s;
      break;
    }
    s--;
  }
  if(n4==g)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}