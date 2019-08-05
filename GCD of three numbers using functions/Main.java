#include <stdio.h>
int main() {
	int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int gcd1=gcd(n1,n2);
  int gcd2=gcd(gcd1,n3);
  printf("%d",gcd2);
	return 0;
}
int gcd(int a, int b)
{
  int min,max_fac;
  if(a<b)
    min=a;
   else
     min=b;
  while(min>=1)
  {
    if((a%min==0) && (b%min==0))
    {
      max_fac=min;
    break;
    }
    else
      min--;
  }
  return max_fac;
}