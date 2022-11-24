#include<stdio.h>
#include<conio.h>
struct student{
	int id1;
	int id2;
	char a,b;
	float percentage;
};
void main(){
	int i;
	struct student recordl = {
		1,2,'A','B',90.5
	};
	printf("size of structure in bytes : %d\n",sizeof(recordl));
    printf("\nAddress of id1 = %u",&recordl.id1);
    printf("\nAddress of id2 = %u",&recordl.id2);
    printf("\nAddress of a = %u",&recordl.a);
    printf("\nAddress of b = %u",&recordl.b);
    printf("\nAddressvof percentage = %u",&recordl.percentage);
    printf("\nAddressvof i = %u",&i);
    
    getch();
}
