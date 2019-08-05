#include<stdio.h>
int sum_num(int n)
{
 int sum=0;
  for(int i=1;i<=n;i++)
    sum=sum+i;
  return sum;
}

int main() {
    int num,res;
  scanf("%d",&num);
  res=sum_num(num);
  printf("%d",res);
  	return 0;
}