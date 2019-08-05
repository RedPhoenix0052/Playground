#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int a[2*n];
  int i=0,j=0,k=0,count=0;
  while(i<n)
  {
    a[k]=arr[i];
    k++;
    if(i!=(n-1))
    j=i+1;
    count=0;
    while(j<n)
    {
      if(arr[i]==arr[j])
      {
        count++;
      }
      j++;
    }
    a[k]=count;
    k++;
    i++;
  }
  int max=0,index;
  for(int i=1;i<k;i=i+2)
  {
    if(a[i]>max)
    {
      max=a[i];
      index=i;
    }
  }
  if(max!=0)
  printf("%d",a[index-1]);
  else
    printf("%d",a[0]);
  return 0;
}