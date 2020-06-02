#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  float m,x;

  int pet,dt;

  std::cin>>m>>pet>>dt;

  x=pet*m;

  if(x<dt)

  {

    std::cout<<"Cannot reach";

  }

  else

    std::cout<<"Can reach";

}