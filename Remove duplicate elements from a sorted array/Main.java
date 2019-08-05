#include <stdio.h>
int main() 
{
    int n;
    scanf("%d",&n);
  	int arr[n];
  	for(int i=0;i<n;i++)
    {
      scanf("%d",&arr[i]);
    }
  	for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
      if(arr[i]==arr[j]&&arr[i]!='x')
      {
        arr[j]='x';
      }
      }
    }
  for(int i=0;i<n;i++)
  {
    if(arr[i]!='x')
      printf("%d ",arr[i]);
  }
	return 0;
}