#include<stdio.h>
int main()
{
  int m,n,flag=0;
  scanf("%d%d",&m,&n);
  int arr[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      scanf("%d",&arr[i][j]);
  int s;
  scanf("%d",&s);
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr[i][j]==s)
      {
        printf("(%d, %d)",i,j);
        flag=1;
        break;
      }
    }
  }
  if(flag==0)
    printf("(-1, -1)");
  return 0;
}