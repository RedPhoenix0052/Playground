#include<stdio.h>
#include<string.h>
int main()
{
	char str[100],temp[50];
    int j=0;
    gets(str);
    //int n=strlen(str);
    for(int i=0;str[i]!='\0';i++)
    {
      if((str[i] == 't' || 'T') && str[i + 1] == 'h' && str[i + 2] == 'e')
      {
        i=i+3;
      }
      else
      {
        temp[j] = str[i];
        j++;
      }
    }
    temp[j] = '\0';
    printf("%s\n", temp);
	return 0;
}