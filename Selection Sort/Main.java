#include<stdio.h>

void selectionSort(int a[], int n) 
{
  	int i, j;
    for(i = 0; i < n; i++) 
    {
		int min_idx = i;
		for(j = i; j < n; j++)
		{
			if(a[min_idx] > a[j])
			{
				min_idx = j;
			}
		}
        int tmp = a[i];
		a[i] = a[min_idx];
		a[min_idx] = tmp;
    }
}

void printArray(int arr[], int size)
{
    int i;
    for(i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}

int main()
{
    int arr[100],n,i;
  	scanf("%d",&n);
  	for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
    selectionSort(arr, n);
    printArray(arr, n);
    return 0;
}