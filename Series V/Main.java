#include<iostream>

using namespace std;

int main()

{

  int n,c,a=121,b=11;

  cin>>n;

  if(n==1)

  {

    cout<<a<<" ";

  }

  else

  {

    cout<<a<<" ";

    for(int i=2;i<=n;i++)

    {

      b=b+4;

      c=b*b;

      cout<<c<<" ";

    }

  }

}