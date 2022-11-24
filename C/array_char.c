#include<stdio.h>
#include<conio.h>

void main()
{
	char greeting[8]={'W','e','l','c','o','m','e'};
	int i;
	for(i=0;i<8;i++)
	{
		printf("%c",greeting[i]);
		getch();
		
	}
}
