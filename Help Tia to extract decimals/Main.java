#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int x=-1;
  string fnum;
  getline (std::cin,fnum);
  x= fnum.find(".");
  if(x!=-1)
  {
    cout<<"Floating part is : ";
    for(int i=x+1;i<fnum.length();i++)
      cout<<fnum.at(i);
 }
  else
    std::cout<<"Floating part is : ";
}