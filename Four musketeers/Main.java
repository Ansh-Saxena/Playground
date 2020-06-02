#include<iostream>
int main()
{
  float x1,y1,x2,y2,x3,y3;
  float X,Y;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  X=(x1+x2+x3)/3;
  Y=(y1+y2+y3)/3;
  std::cout<<(float)X<<"\n"<<(float)Y;
  return 0;
}