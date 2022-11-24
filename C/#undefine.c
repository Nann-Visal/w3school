#include<stdio.h>
#include<conio.h>

#define height 100

void main()
{
	printf("First define value for height: %d\n",height);
	
	#undef height // eliminate 100 from first value of height
	#define height 600 // new value for height
	
	printf("Second define value for height: %d\n",height);
	getch();
}
