#include <stdlib.h>
#include <stdio.h>
 
//member functions declaration
void insertionSort(int arr[], int length);
void printArray(int array[], int size);
 
// main function
int main() 
{
	int array[100],i,n;
  	scanf("%d",&n);
  	for(i=0;i<n;i++)
      scanf("%d",&array[i]);
	insertionSort(array, n);
	return 0;
}
 
void insertionSort(int arr[], int length) 
{
	int i, j;
	for (i = 1; i < length; i++) 
	{
        int key = arr[i];
 		for(j = i - 1; j >= 0; j--)
 		{
            if(arr[j] > key)
            {
            	arr[j + 1] = arr[j];
            }
            else
            {
              break;
            }
 		}
        arr[j + 1] = key;
	}
	printArray(arr, length);
}
void printArray(int array[], int size)
{ 
 	int j;
	for (j = 0; j < size; j++)
	{
 		printf("%d\n",array[j]);
 	}
}