#include <stdio.h>
int main(){
	int n1,n2,n3;
    scanf("%d%d%d",&n1,&n2,&n3);
  	int g1=compare(n1,n2);
  	int g2=compare(g1,n3);
  	printf("%d",g2);
  	return 0;
}
int compare(int a, int b)
{
  return a>b?a:b;
}