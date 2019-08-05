// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void maxeindex(int list[],int size);
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  maxeindex(arr,n);
   return 0;
}
void maxeindex(int list[],int size)
{
  int max=0,index;
  for(int i=0;i<size;i++)
  {
    if(max<list[i])
      max=list[i];
      index=i;
  }
    printf("%d",index);
}