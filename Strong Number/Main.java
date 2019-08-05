#include <stdio.h>
int main() {
	int n,r,f=1,sum=0,cnum;
  scanf("%d",&n);
  cnum=n;
  while(n>0)
  {
    r=n%10;
    n=n/10;
    f=1;
    for(int i=1;i<=r;i++)
    {
      f=f*i;
    }
    sum=sum+f;
  }
  if(cnum==sum)
    printf("Yes");
  else
  printf("No");
	return 0;
}