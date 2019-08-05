/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main() {
   int n,arr[10],i;
   scanf("%d",&n);
  	for(i=0;i<n;i++)
   {
       scanf("%d",&arr[i]);
   }
  batchSum(arr,n);
  return 0;  
}
void batchSum(int list[],int size)
 {
     int i, batchSum1=0,batchSum2 = 0;
     
     for( i = 0; i < size/2 ; i++)
     { 
       batchSum1=batchSum1+list[i]; 
     }  
    for( i = size/2; i < size ; i++)
     { 
       batchSum2=batchSum2+list[i];    
     }  
      if(batchSum1 == batchSum2)
     {
         printf("Perfect Batch" );
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }