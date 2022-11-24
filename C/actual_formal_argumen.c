#include<stdio.h>
#include<conio.h>

void sum(int i , int j , int k);
//calling function
void main(){
	int a=5;
	sum(3,2*a,a);//actual
	getch();
}
void sum(int i , int j , int k)
{
	int s;
	s = i+j+k;//formal
	printf("Sum = %d",s);
}
