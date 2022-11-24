#include<stdio.h>
#include<conio.h>

int getInteger();

void main()
{
	int  n , i;
	int flag = 0;
	n = getInteger();
	for(i = 2  ;  i<=n/2  ;  ++i)
	{
		if(n%i==0)
		{
			flag = 1;
			break;
		}
	}
	if(flag==1)
	{
		printf("%d is not prime number",n);
		
	}
	else 
	    
	    printf("%d is a prime number",n);
	getch();
}
int getInteger()
{
	int n;
	printf("Enter positive number:");
	scanf("%d",&n);
	
	return n;
}
