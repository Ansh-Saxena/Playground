#include<iostream>

using namespace std;

int main()

{

  int a;

  float b,c,d,f;

  std::cin>>a>>b;

  c=a*b;

  d=(b*50)/100;

  if(a<=2)

    std::cout<<c-d;

  else if(a==3)

    std::cout<<2*b;

  else

    std::cout<<"Number of items is more";

}