#include<stdio.h>
int main(){
   int n;
  scanf("%d",&n);
  prime_num(n);
    return 0;
}
void prime_num(int n)
{
  int count;
  for(int i=2;i<=n;i++)
  {
    count=0;
    for(int j=1;j<=i;j++)
    {
      if((i%j)==0)
        count++;
    }
    if(count==2)
      printf("%d\n",i);
  }
}