#include<stdio.h>
#include<conio.h>
void maxmin(int a[] , int n , int *max , int *min )
{
	int i;
	*max = *min =a[0];
	for(i=1;i<n;i++)
	{
		if(a[i]>*max)
			*max=a[i];
		else if (a[i]<*min)
			*min=a[i];
	}
}
void main()
{
	int c[10],i,big,small;
	printf("Enter 10 Number : ");
	for(i=0;i<10;i++)
		scanf("%d",&c[i]);
	maxmin(c,10,&big,&small);
	printf("Larges: %d\n",big);
	printf("Smallest: %d\n",small);
	
	getch();
}
