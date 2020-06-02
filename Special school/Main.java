#include<iostream>
#include <bits/stdc++.h> 
#include<string>
using namespace std;
int main()
{
  string a,b,c;
  cin>>a;
  c=a;
  cin>>b;
  reverse(a.begin(), a.end());
  if(a==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
}