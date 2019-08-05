#include <stdio.h>
int main() {
	int n,f;
  scanf("%d",&n);
  f=n%10;
  while(n>10)
  {
    n=n/10;
  }
  printf("%d",f+n);
	return 0;
}