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
	printf("Memory size accupied by data:%d\n",sizeof(data));
	getch();
}
