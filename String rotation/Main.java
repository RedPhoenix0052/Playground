#include<stdio.h>
#include<string.h>
int  Rotation_check(char str1[], char str2[])
{
  int index,f=0;
  for(int i=0;i<strlen(str2);i++)
  {
    if(str2[i]==str1[0])
    {
      index=i;
      break;
    }
  }
  for(int i=0;i<strlen(str1);i++)
  {
   
      if(str1[i]!=str2[((i+index)%strlen(str1))])
      {
        f=1;
        break;
      }
    
  }
  if(f==0)
    printf("Yes");
  else
    printf("No");
}
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);
  Rotation_check(st1,st2);
  return 0;
}