// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  char str[100];
  gets(str);
  int a[26],offset;
  for(int i=0;i<26;i++)
    a[i]=0;
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]>='a'&&str[i]<='z')
    {
      offset=str[i]-'a';
      a[offset]++;
    }
  }
  for(int i=0;i<26;i++)
  {
    if(a[i]!=0)
    {
      printf("%c%d ",('a'+i),a[i]);
    }
  }
   return 0;
}