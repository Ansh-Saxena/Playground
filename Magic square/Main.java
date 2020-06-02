#include <bits/stdc++.h> 

using namespace std; 

int main() 
{ int n;
 cin>>n;
 int N=n;
 
    int mat[n][n]; 
 for(int i=0;i<n;i++){
   for(int j=0;j<n;j++)
     cin>>mat[i][j];}
      
     int sum = 0,sum2=0;  
    for (int i = 0; i < N; i++) 
        sum = sum + mat[i][i]; 
    for (int i = 0; i < N; i++) 
        sum2 = sum2 + mat[i][N-1-i]; 
    if(sum!=sum2)  {
          cout<<"No";
        return 0;}
    for (int i = 0; i < N; i++) { 
          
        int rowSum = 0;      
        for (int j = 0; j < N; j++) 
            rowSum += mat[i][j]; 
        if (rowSum != sum)  {
          cout<<"No";
        return 0;}
    } 
  
    for (int i = 0; i < N; i++) { 
          
        int colSum = 0;      
        for (int j = 0; j < N; j++) 
            colSum += mat[j][i]; 
        if (sum != colSum)  {
          cout<<"No";
        return 0;}
    } 
  cout<<"Yes";
    return true; 
} 