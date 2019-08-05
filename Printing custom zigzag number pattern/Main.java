#include <stdio.h>
int main() {
	int n;
    int num=1;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
      if(i%2==1)
      {
        for(int j=1;j<=n-1;j++)
          printf("%d",num);
        num=num+1;
        printf("%d",num);
      }
      else
      {
        printf("%d",num);
        num=num-1;
        for(int j=1;j<=n-1;j++)
        printf("%d",num);
         
      }
      printf("\n");
      num=num+1;
    }
	return 0;
}