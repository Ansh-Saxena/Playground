#include <iostream>
int main()
{
  int num;
  std::cin>>num;
  (num%2==0)?std::cout<<"Possible":std::cout<<"Not possible";
  return 0;
}