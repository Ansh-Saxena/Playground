#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int arr[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      cin>>arr[i][j];
    }}
  int row=0,indr=0,indc=0,col=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++){
    int temp=0;
    for(int j=0;j<n;j++){
      temp+=arr[i][j];
    }
    if(temp>row){
      row=temp;indr=i+1;}
    cout<<temp<<" ";
  }
  cout<<"\n";
  cout<<"Row "<<indr<<" has maximum sum\n";
  
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++){
    int temp=0;
    for(int j=0;j<m;j++){
      temp+=arr[j][i];
    }
    if(temp>col){
      col=temp;indc=i+1;}
    cout<<temp<<" ";
  }
  cout<<"\n";
  cout<<"Column "<<indc<<" has maximum sum";
}