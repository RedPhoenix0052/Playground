#include <stdio.h>
int main() {
	int n;
  int count=1;
  scanf("%d",&n);
  for(int i=1;i>0;i++)
  {
    if(i%2!=0)
    {
      if(count>n)
      {
        break;
      }
      else
      {
      printf("%d\n",i);
      count++;
      }
    }
  }
	return 0;
}