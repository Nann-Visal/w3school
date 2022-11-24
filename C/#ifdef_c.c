#include<stdio.h>
#include<conio.h>



void main()
{
	#ifdef RUPP 
	printf("RUPP is define So the line is added to File C\n");
	#else
	printf("RUPP is not define\n");
	#endif
	
	getch();
}
