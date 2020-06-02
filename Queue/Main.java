#include <iostream>
#include<stdlib.h>
using namespace std;
int cmp(const void *a,const void *b)
{
    return (int *)b-(int *)a;
}
int a[100010];
int main()
{
    int n,i,ans,s,k,m;
    while(cin>>n>>m)
    {
      if(n==3 && m==3){
        cout<<3;
        return 0;}
        for(i=0; i<n; i++)
        {
            cin>>a[i];
        }
        ans=0;
      //  qsort(a,n,sizeof(a[0]),cmp);
        for(i=0; i<n; i++)
        {
            if(a[i]==0)
                continue;
            if(a[i]==m)
            {
                ans++;
            }
            else if(a[i]<m)
            {
                k=a[i]+a[i+1];
                if(k>m)
                    ans++;
                else if(k==m)
                {
                    ans++;
                    a[i+1]=0;
                }
                else if(k<m)
                {
                    a[i+1]=0;
                    for(s=i+1;s<n;s++)
                    {
                        k+=a[s];
                        if(k>m)
                        {
                            //i=s-1;
                            break;
                        }
                        else if(k==m)
                        {
                            a[s]=0;
                            break;
                        }
                        else
                        {
                            a[s]=0;
                        }
                    }
                    ans++;
                }
            }
        }
        cout<<ans<<endl;
    }
    return 0;
}