#include<stdio.h>
#include<conio.h>

void function1();
void function2();
//using pragma
#pragma startup function1
#pragma exit function2

void main()
{
	printf("Now we are in main function\n");
	getch();
}
