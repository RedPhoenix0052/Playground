#include<stdio.h>
int main()
{
  int n,n1,n2;
  scanf("%d",&n);
  n1=n%10;
  n2=n/10;
  printf("%d",n1+n2);
  return 0;
}