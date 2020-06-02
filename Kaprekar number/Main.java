#include<iostream>

using namespace std;

int main()

{

  int n,x,t=0,p=1,a,b;

  cin>>n;

  t=n;

  x=n*n;

  while(t>0)

  {

    p=p*10;

    t=t/10;

  }

  a=x/p;

  b=x%p;

  if(a+b==n)

    cout<<"Kaprekar Number";

  else

    cout<<"Not a Kaprekar Number";

 

}