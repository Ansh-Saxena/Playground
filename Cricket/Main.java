#include<iostream>

#include<iomanip>  

using namespace std;

int main()

{

int tb,tr,cr,cb;

 

std::cin>>tb>>tr>>cr>>cb;

float t6=tb/6;

int t=cb/6;

int p=cb%6;

float c6= ((float)t+ (float)p/10);

float crr=cr/c6;

float trr=tr/t6;

std::cout<<t6<<"\n"<<fixed << setprecision(1) <<c6<<"\n"<<crr<<"\n"<<trr;

if(crr>trr)

{

  cout<<"\nEligible to Win";

}

else

  cout<<"\nNot Eligible to Win";

return 0;

}