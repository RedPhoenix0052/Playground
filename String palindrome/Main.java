#include<stdio.h>
#include<string.h>
int main()
{
  char temp;
  char str[20];
  char str1[20];
  scanf("%s",&str);
  strcpy(str1,str);
  int len=strlen(str);
  for(int i=0;i<len/2;i++)
  {
    temp=str[i];
    str[i]=str[(len-i)-1];
    str[(len-i)-1]=temp;
  }
  if(strcmp(str1,str)==0)
    printf("%s is a palindrome",str1);
  else
    printf("%s is not a palindrome",str1);
  return 0;
}