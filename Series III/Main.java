#include<iostream>

using namespace std;

int main()

{

  int n,a=6,b=5;

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

      a=a+b;

      b=b+5;

      cout<<a<<" ";

    }

  }

}