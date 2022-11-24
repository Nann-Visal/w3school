#include<stdio.h>
#include<conio.h>

int addNumber(int num1,int num2);

void main(){
	int var1,var2;
	printf("Enter Number 1:");
	scanf("%d",&var1);
	printf("Enter Number 2:");
	scanf("%d",&var2);
	
	int result = addNumber(var1,var2);
	printf("Result=%d",result);
	getch();
	
}
int addNumber(int num1,int num2)
{
	int sum;
	sum = num1+num2;
	return sum;
}
