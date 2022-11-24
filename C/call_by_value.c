#include<stdio.h>
#include<conio.h>
void swap(int a , int b);

void main()
{
	int m = 22;
	int n = 44;
	printf("m=%d , n=%d",m,n);
	//call funtion
	swap(m,n);
	getch();
}
void swap(int a , int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	printf("\nm=%d , **** , n=%d",a,b);
}
