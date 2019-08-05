#include <stdio.h>
int main() {
    int n;
    int num;
    scanf("%d",&n);
    num=n;
    for(int i=1;i<=n;i++)
    {
     for(int j=1;j<=n-(i-1);j++)
     {
      printf("%d",num); 
      num=num-1;
     }
      num=n-i;
      printf("\n");
    }
	return 0;
}