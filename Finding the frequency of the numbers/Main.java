#include<stdio.h>
int main()
{
  int n,k;
  scanf("%d%d",&n,&k);
  int arr[n],carr[k];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<k;i++)
    carr[i]=0;
  for(int i=0;i<n;i++)
  {
    carr[(arr[i]-1)]+=1;
  }
  for(int i=0;i<k;i++)
  {
    printf("%d %d\n",(i+1),carr[i]);
  }
  return 0;
}