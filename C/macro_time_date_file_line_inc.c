#include<stdio.h>
#include<conio.h>

void main()
{
	printf("%s\n",__TIME__);
	printf("%s\n",__DATE__);
	printf("%s\n",__FILE__);
	printf("%d\n",__LINE__);
	
	getch();
}
