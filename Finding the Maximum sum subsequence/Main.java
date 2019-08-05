#include<stdio.h>
int main()
{
  int n,index;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int sum1=0;
  int sum2=0;
  for(int i=0;i<n;i++)
  {
    sum1=sum1+arr[i];
    if(arr[i]>arr[i+1])
    {
      index=i+1;
      break;
    }
    if(i==(n-1))
      index=n;
  }
  //printf("%d",index);
  while(index<n)
  {
  for(int j=index;j<n;j++)
  {
    sum2=sum2+arr[j];
    if(arr[j]>arr[j+1])
    {
      if(sum2>sum1)
        sum1=sum2;
      index=j+1;
      break;
    }
    if(j==(n-1))
    {
      if(sum2>sum1)
        sum1=sum2;
      index=n;
    }
  }
  }
  printf("%d",sum1);
  return 0;
}