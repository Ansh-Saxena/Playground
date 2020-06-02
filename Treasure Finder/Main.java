#include<iostream>

using namespace std;

int main()

{

  int a,b,c,i,t,s1;

  std::cin>>a>>b>>c;

  if(a>b && a>c)

  {

    if(b>c)

    {

      s1=b;

    }

    else

    {

      s1=c;

    }

  }

  else if(b>a && b>c)

  {

    if(a>c)

    {

      s1=a;

    }

    else

    {

      s1=c;

    }

  }

    else

    {

      if(a>c)

      {

        s1=a;

      }

      else

      {

        s1=b;

      }

    }

  std::cout<<"The treasure is in box which has number "<<s1<<"\n";

  for(i=1;i<=5;i++)

  {

    if (a%i==0 && b%i==0 && c%i==0)

    {

      t=i;

    }

  }

  std::cout<<"The code to open the box is "<<t;

}