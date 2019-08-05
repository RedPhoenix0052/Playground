#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int carr[n];
  for(int i=0;i<n;i++)
    carr[i]=0;
  for(int i=0;i<n;i++)
  {  
    carr[(arr[i]-1)]+=1;
  }
  for(int i=0;i<n;i++)
  {
    if(carr[i]==0)
      printf("%d",i+1);
  }
  return 0;
}