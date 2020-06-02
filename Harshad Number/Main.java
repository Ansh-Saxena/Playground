#include<iostream>

using namespace std;

int main()

{

int n,y,a,z=0;

  std::cin>>n;

  a=n;

while(n>0)

{

   y=n%10;

   z=z+y;

   n=n/10;

}

if(a%z==0)

{

   std::cout<<"Harshad Number";

}

  else

  {

    std::cout<<"Not Harshad Number";

  }

  }