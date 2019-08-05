#include<stdio.h>
int main()
{
  int n,count=0,count1=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n;i++)
  {
    if(arr[i]==1)
      count++;
    else if(arr[i]==0)
    {
      if(count>count1)
        count1=count;
      count=0;
    }
  }
  if(count1>count)
    printf("%d",count1);
  else
    printf("%d",count);
  return 0;
}