#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[200];
  int v=0,c=0,w=0,d=0,s=0;
  cin.get(str,200);
  for(int i=0;i<strlen(str);i++){
    char temp=str[i];
    if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
      v++;
    else if((!(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U'))&&((temp>=65&&temp<=90)||(temp>=97&&temp<=122)))
      c++;
    if(temp==32)
      w++;
    if(temp>=48&&temp<=57)
      d++;
    if(!((temp>=65&&temp<=90)||(temp>=97&&temp<=122)||(temp>=48&&temp<=57)||temp==32))
      s++;
  }
  cout<<"Vowels:"<<v<<"\n";
  cout<<"Consonants:"<<c<<"\n";
  cout<<"White Spaces:"<<w<<"\n";
  cout<<"Digits:"<<d<<"\n";
  cout<<"Symbols:"<<s<<"\n";
  
}