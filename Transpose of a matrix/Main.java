#include<stdio.h>
int main()
{
  int r,c;
  scanf("%d%d",&r,&c);
  int mat1[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat1[i][j]);
    }
  }
  int trns[c][r];
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      trns[i][j]=mat1[j][i];
    }
  }
  //printf("%d",trns[0][0]);
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      printf("%d ",trns[i][j]);
    }
    printf("\n");
  }
  return 0;
}