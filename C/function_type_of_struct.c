#include<stdio.h>
#include<conio.h>
//declaration struct
struct Employee {
	int Id;
	char Name[50];
	int Age;
	long Salary;
};
struct Employee Input(); //function declaration int type of struct Employee
void main(){
	struct Employee Emp;//declaration variable "Emp" in type of struct
	Emp = Input();//call function "Input above"
	
	printf("\n\nEmployee Id : %d",Emp.Id);
	printf("\n\nEmployee Name : %s",Emp.Name);
	printf("\n\nEmployee Age : %d",Emp.Age);
	printf("\n\nEmployee Salary : %ld",Emp.Salary);
	
	getch();	
}
struct Employee Input(){
	struct Employee E;
	printf("\nEnter Employee Id:");
	scanf("%d",&E.Id);
	printf("\nEnter Employee Name:");
	scanf("%s",&E.Name);
	printf("\nEnter Employee Age:");
	scanf("%d",&E.Age);
	printf("\nEnter Employee Salary:");
	scanf("%ld",&E.Salary);
	
	return E;
}
