#include <stdio.h>
int main() 
{
	int m,n;
  	scanf("%d%d",&m,&n);
  	int a1[m],a2[n],a3[m+n];
    int c=0,temp;
  	for(int i=0;i<m;i++)
    	scanf("%d",&a1[i]);
  	for(int j=0;j<n;j++)
      	scanf("%d",&a2[j]);
  	for(int i=0;i<m;i++)
    {
      a3[i]=a1[i];
      c++;
    }
  	for(int i=0;i<n;i++)
    {
      a3[c]=a2[i];
      c++;
    }
  for(int i=0;i<((m+n)-1);i++)
  {
    for(int j=i+1;j<(m+n);j++)
    {
      if(a3[i]>a3[j])
      {
        temp=a3[i];
        a3[i]=a3[j];
      	a3[j]=temp;
      }
    }
  }
  for(int i=0;i<m+n;i++)
    printf("%d ",a3[i]);
	return 0;
}