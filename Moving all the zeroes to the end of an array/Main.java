#include<stdio.h>
int main()
{
  int n,count=0,j=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  scanf("%d",&arr[i]);
  for(int i=0;i<n;i++)
  {
    if(arr[i]==0)
      count++;
  }
  int arr1[n-count];
  for(int i=0;i<n;i++)
  {
    if(arr[i]!=0)
    {
    arr1[j]=arr[i];
      j++;
    }
  }
  for(int i=0;i<n;i++)
  {
    if(i<(n-count))
      arr[i]=arr1[i];
    else
      arr[i]=0;
  }
  for(int i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}