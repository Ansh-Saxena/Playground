#include<iostream>

using namespace std;

int main()

{

  int n;

  cin>>n;

  for(int i=1;i<=n;i++)

  {

    for(int j=1;j<=i;j++)

    {

      if(j<i)

        cout<<i<<"*";

      else

        cout<<i;

    }

    cout<<endl;

  }

  for(int i=n;i>=1;i--)

  {

    for(int j=1;j<=i;j++)

    {

      if(j<i)

        cout<<i<<"*";

      else

        cout<<i;

    }

    cout<<endl;

  }

}