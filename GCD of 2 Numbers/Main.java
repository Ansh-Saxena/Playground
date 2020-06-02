#include<iostream>
using namespace std;
int gdc(int,int);
int main()
{
  int a,b,c;
  cin>>a>>b;
  c=gdc(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<c;
}
int gdc(int x,int y)
{
  int s,g;
  if(x<y)
    s=x;
  else
    s=y;
  while(s>=1)
  {
    if((x%s==0)&&(y%s==0))
    {
      g=s;
      break;
    }
    s--;
  }
}