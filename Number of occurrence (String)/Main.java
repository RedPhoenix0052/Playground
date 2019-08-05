#include<stdio.h>
#include<string.h>
int main()
{
  char str1[50],str2[50];
  int count=0,match=0;
  gets(str1);
  gets(str2);
  int len1=strlen(str1);
  int len2=strlen(str2);
  for(int i=0;i<len1;i++)
  str1[i]=tolower(str1[i]);
  for(int i=0;i<len2;i++)
  str2[i]=tolower(str2[i]);
  //puts(str1);
  //puts(str2);
  for(int i=0;i<=((len1-1)-(len2-1));i++)
  {
    match=1;
    for(int j=0;j<len2;j++)
    {
    if(str1[i+j]!=str2[j])
    {
      match=0;
      break;
    }
    }
    if(match==1)
    {
      count++;
    }
  }
  printf("%d",count);
  return 0;
}