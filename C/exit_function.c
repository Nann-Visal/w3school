#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int exittest(int testval){
	if(testval==3)
	{
		exit(1);
	}
	return 0;
}
void main(){
	int i;
	for(i=1;i<=99;i++)
	{
		exittest(i);
		printf("i=%d\n",i);
	}
	getch();
	
}
