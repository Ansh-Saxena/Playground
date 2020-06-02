#include<iostream>

#include<iomanip>

#include<math.h>

using namespace std;

int main()

{

  float n,root,count=0.00;

  int val=1,days,ans;

  std::cin>>n;

  root=(1/sqrt(n));

  std::cout<<setprecision(2);

  for(int i=0;i<n;i++)

  count=root+count;

  days=int(count);

  ans=n+days;

  std::cout<<ans+1;

}