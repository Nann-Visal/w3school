#include<stdio.h>
#include<conio.h>
#include<string.h>

union Data{
	int i;
	float f;
	char str[20];
};
void main(){
	union Data data;
	data.i = 10;
	data.f = 220.5;
	strcpy(data.str ,"C programming");
	printf("data.i: %d\n",data.i);
	printf("data.f: %f\n",data.f);
	printf("data.str: %s\n",data.str);
	/*value output by only true on data.str becaus it is the final of using but data.i and data.f output not true because
	we call them to use first 
	*/
	getch();
}
