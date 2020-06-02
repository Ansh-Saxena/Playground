#include<iostream>
using namespace std;
int factorial(int);
int main()
{
  int n,fact=1;
  cin>>n;
  fact=factorial(n);
  cout<<"The factorial of "<<n<<" is "<<fact;
}
int factorial(int a)
{
  if(a==0)
  {
    return 1;
  }
  else
  {
    return (a*factorial(a-1));
  }
}