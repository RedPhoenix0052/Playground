#include<stdio.h>
#include<string.h>
int main()
{
	char str[50];
  int key;
  gets(str);
  scanf("%d",&key);
  int len=strlen(str);
  int offset=key%26;
  for(int i=0;i<len;i++)
  {
    char temp;
    if(str[i]>='A'&&str[i]<='Z')
    {
      temp=str[i];
      str[i]=str[i]-offset;
      if(str[i]<'A')
      str[i]='Z'+1-(offset-(temp-'A'));    
    }
    if(str[i]>='a'&&str[i]<='z')
    {
      temp=str[i];
      str[i]=str[i]-offset;
      if(str[i]<'a')
      str[i]='z'+1-(offset-(temp-'a'));
    }
  }
  printf("%s",str);
  return 0;
}