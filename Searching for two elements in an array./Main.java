#include<stdio.h>
int main()
{
  int n,ele,c;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int loop=1;loop<=2;loop++)
  {
    scanf("%d",&ele);
    c=0;
    for(int i=0;i<n;i++)
    { 
      if(ele==a[i])
      {
        c=1;
        printf("%d",i);
      }
    }
    if(c==0)
      printf("-1");
    printf("\n");
  }
  return 0;
}