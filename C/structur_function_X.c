#include<stdio.h>
#include<conio.h>
typedef struct complex{
	float real;
	float imag;
}complex;
complex add(complex n1,complex n2);
void main(){
	complex n1,n2,temp;
	printf("For 1st complex number \n");
	printf("Enter real and imaginary part respectively : ");
	scanf("%f %f ",&n1.real,&n1.imag);
	printf("For 2st complex number \n");
	printf("Enter real and imaginary part respectively :");
	scanf("%f %f ",&n2.real,&n2.imag);
	
	temp = add(n1,n2);
	printf("Add = %.1f + %.1f ",temp.real,temp.imag);
	getch();
}
complex add(complex n1,complex n2)
{
	complex temp;
		temp.real = n1.real + n2.real;
		temp.imag = n1.imag + n2.imag;
		return(temp);
}
		
