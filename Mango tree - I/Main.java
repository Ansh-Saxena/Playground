#include<iostream>

using namespace std;

int main()

{

int rows,columns,tree_no;

int loc_i,loc_j,count=0;

std::cin>>rows;

std::cin>>columns;

std::cin>>tree_no;

int arr[rows][columns];

for(int i=0;i<rows;i++)

{

   for(int j=0;j<columns;j++)

   {

     count++;

     if(count==tree_no)

     {

       loc_i=i;

       loc_j=j;

     }

   }

}

int i=0;

int j=0;

for(j=0;j<columns;j++)

{

   if(i==loc_i && j==loc_j)

   {

     std::cout<<"Yes";

     break;

   }

}

int flag=0;

if(flag==0)

{

   j=0;

   for(i=0;i<rows;i++)

   {

     if(i==loc_i && j==loc_j)

     {

       std::cout<<"Yes";

       break;

     }

   }

flag=1;

}

else if(flag==1)

{

   j=columns-1;

   for(i=0;i<rows;i++)

   {

     if(i==loc_i &&j==loc_j)

     {

       cout<<"Yes";

       break;

     }

   }

}

 if(loc_i!=0 && loc_j!=0)

   std::cout<<"No";

}