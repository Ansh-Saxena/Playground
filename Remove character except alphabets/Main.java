#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[200];
  cin>>str;
  for(int i=0;i<strlen(str);i++){
    char temp=str[i];
    if((temp>=65 && temp<=90)||(temp>=97 &&temp<=122))
      cout<<temp;
  }
}