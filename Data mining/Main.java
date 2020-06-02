#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  int n,t,e,o;

  cin>>n;

  while(n>0)

  {

    t=n%10;

    if(t%2==0)

    {

      e=e+t;

    }

    else

    {

      o=o+t;

    }

    n=n/10;

  }

  if(e==o)

  {

    cout<<"Yes";

  }

  else

  {

    cout<<"No";

  }

 

}