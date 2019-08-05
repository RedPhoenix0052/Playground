#include <stdio.h>
int main() {
	int num;
  int cnum,armnum,count=0,arm=0,r;
  scanf("%d",&num);
  cnum=num;
  armnum=num;
  while(cnum>0)
  {
    cnum=cnum/10;
    count+=1;
  }
  while(num>0)
  {
    r=num%10;
    num=num/10;
    arm+=pow(r,count);
  }
  if(armnum==arm)
  printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}