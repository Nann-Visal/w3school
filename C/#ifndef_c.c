#include<stdio.h>
#include<conio.h>

#define RUPP 100

void main()
{
	#ifndef IFL 
	{
		printf("is not define\n");
		#define IFL 300 //  define value to IFL
		printf("IFL=%d\n",IFL);
	}
	#else
	printf("is define\n");
	#endif
	
	getch();
}
