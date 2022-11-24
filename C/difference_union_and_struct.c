#include<stdio.h>
#include<conio.h>
struct Employee{
	int age;
	char name[50];
	char departmen[20];
	float salary;
};
union Person{
	int age;
	char name[50];
	char department[20];
	float salary;
};
void main(){
	struct Employee emp1;
	union Person person1;
	printf("The size of employee structure =%d\n",sizeof(emp1));
	printf("The size of person union =%d\n",sizeof(person1));
}
