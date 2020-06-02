#include<iostream>
using namespace std;
int fibo(int);
int main()
{
 int num,result;
  cin>>num;
  result=fibo(num-1);
  cout<<"The term "<<num<<" in the fibonacci series is "<<result;
}
int fibo(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return (fibo(n-1)+fibo(n-2));
  }
}