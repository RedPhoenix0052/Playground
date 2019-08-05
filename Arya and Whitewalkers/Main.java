#include <stdio.h>
int main() {
	int x,n;
  	scanf("%d",&x);
  	if(x%2==0)
    {
      n=1;
    }
  	if(x%3==0)
    {
      n=2;
    }
  	if(x%5==0)
    {
      n=5;
    }
  	else
      n=1;
  	printf("%d",n);
	return 0;
}