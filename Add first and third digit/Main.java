#include<stdio.h>
int main()
{
  int num,num1,num2;
  scanf("%d",&num);
  num1=num%10;
  num2=num/100;
  printf("%d",num1+num2);
  return 0;
}