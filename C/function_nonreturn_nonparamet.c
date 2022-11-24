#include<stdio.h>
#include<conio.h>

void checkPrimeNumber();
void main(){
	checkPrimeNumber();
	getch();
}

void checkPrimeNumber(){
	int n,i;
	int flag = 0;
	printf("Enter a positive integer =");
	scanf("%d",&n);
	
	for(i=2;i<=n/2;++i)
	{
		if(n%i==0){
			flag = 1;
		}
	}
	if(flag==1)
	{
		printf("%d is not a prime number",n);
	}
	else
	    printf("%d is a prime number",n);
}
