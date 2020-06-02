#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  int unit,cost;

  std::cin>>unit;

  if(unit<=200)

  {

    cost=0.5*unit;

  }

  else if(unit>200 && unit<=400)

  {

    cost=0.65*unit;

    cost=cost+100;

  }

  else if(unit>400 && unit<=600)

  {

    cost=0.80*unit;

    cost=cost+200;

  }

  else

  {

    cost=1.25*unit;

    cost=cost+425;

  }

  std::cout<<"Rs."<<cost;

}