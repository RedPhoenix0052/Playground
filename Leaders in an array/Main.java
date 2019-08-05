#include <stdio.h>
int main() 
{
    int n,flag;
  	scanf("%d",&n);
  	int a[n];
  	for(int i=0;i<n;i++)
      scanf("%d",&a[i]);
  	for(int i=0;i<n-1;i++)
    {
      flag=0;
      for(int j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          flag=1;
        }
      }
      if(flag==0)
        printf("%d ",a[i]);
    }
    printf("%d",a[n-1]);
    return 0;
}