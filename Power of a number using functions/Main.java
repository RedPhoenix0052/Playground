#include<stdio.h>
#include<math.h>
int main(){
    int n,p;
  scanf("%d%d",&n,&p);
  calc_pow(n,p);
  	return 0;
}
void calc_pow(int n,int p)
{
  int res=pow(n,p);
  printf("%d",res);
}