#include<stdio.h>
#include<conio.h>
int* max (int *a, int *b)
{
	if(*a>*b)
		return a;
	else
		return b;
}
void main()
{
	int x=20,y=10;
	int *p;
	p=max(&x,&y);
	printf("max = %d\n",*p);
	getch();
}
