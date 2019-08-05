#include<stdio.h>
int main()
{
	int r,c,k;
    scanf("%d%d",&r,&c);
    int arr[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        scanf("%d",&arr[i][j]);
  for(int i=0;i<r;i++)
  { 
    k=0;
    for(int j=i;j<c;j++)
    {
      if(k<=j)
        printf("%d ",arr[k][j]);
      k++;
    }
  }
	return 0;
}