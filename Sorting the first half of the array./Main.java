#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int h=n/2;
  int temp;
  for(int i=0;i<h;i++)
  {
    for(int j=0;j<(h-1);j++)
    {
      if(arr[j]>arr[j+1])
      {
        temp=arr[j+1];
      arr[j+1]=arr[j];
      arr[j]=temp;
      }
    }
  }
  for(int i=0;i<n;i++)
    printf("%d ",arr[i]);
	return 0;
}