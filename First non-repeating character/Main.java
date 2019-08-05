#include<stdio.h>
#include<string.h>
int main()
{
  char str[20];
  gets(str);
  int n=strlen(str);
  int c=0;
  for(int i=0;i<n-1;i++)
  {
    c=0;
    for(int j=0;j<n;j++)
    {
      if(str[i]==str[j]&&i!=j)
      {
        c++;
      }
      if(c>0)
        break;
    }
    if(c==0)
    {
      printf("%c",str[i]);
      break;
    }
  }
  if(c>0)
    printf("All the characters are repetitive");
return 0;
}