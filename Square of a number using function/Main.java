#include<stdio.h>
int square_num(int n)
{
  int square=n*n;
  return square;
}
int main() {
  int num,sq;
  scanf("%d",&num);
  sq=square_num(num);
  printf("%d",sq);
   return 0;
}