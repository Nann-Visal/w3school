#include<stdio.h>
#include<conio.h>

void main()
{
	int a[10];
	int n , s, i;
	printf("How many your values do you want to Input?\n ");
	scanf("%d",&n);
	
	if(n>10)
	{
		printf("It is graeter than array size \n");
    	getch();
	    return;
    }
    for( i=0 ; i<n ; i++)
    {
    	printf("Input a value : ");
    	scanf("%d",&a[i]);
	}
	for( i=0 ; i<n ; i++)
	{
		s += a[i];
		printf("Sum=%d",s);
		getch();
	
	}
	
}
