#include <iostream>
using namespace std;
int main()
{
  int limit,w;
  cin>>limit>>w;
  if(w>limit)
    cout<<"Sorry, you can't enter";
  else if(w==limit)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Yes, you can enter.";
}