#include<stdio.h>
int main()
{
 int n,flag=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  	scanf("%d",&a[i]);
  int val;
  scanf("%d",&val);
  for(int i=0;i<n;i++)
  {
    if(val<a[i]&&flag==0)
    {
      printf("%d %d ",val,a[i]);
      flag=1;
    }
    else
      printf("%d ",a[i]);
  }
  if(flag==0)
    printf("%d ",val);
  return 0;
}