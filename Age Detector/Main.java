#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  int a,y;

  std::cin>>a>>y;

  if(a>y)

  {

    int x=1900+a;

    int z=2000+y;

    std::cout<<z-x;

  }

  else

  {

    int x=2000+a;

    int z=2000+y;

    std::cout<<z-x;

  }

}