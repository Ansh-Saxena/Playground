#include<iostream>

using namespace std;

int main()

{

  int n,x;

  cin>>n;

  for(int i=1;i<=n;i++)

  {

    x=i*i;

    if(x%2==0)

    {

      cout<<x-2<<" ";

    }

    else

    {

      cout<<x-1<<" ";;

    }

  }

}