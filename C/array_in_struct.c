#include<stdio.h>
#include<conio.h>
struct employee{
	char name[50];
	int age;
	float salary;
};
void main(){
	struct employee employees[10];
	int counter, index, count, totalsalary;
	printf("Enter number of employee:\n");
	scanf("%d",count);
	for(counter=0;counter<count;counter++){
		printf("Enter name, Age , Salary of Employee\n");
		scanf("%s %d %f",&employees[counter].name,&employees[counter].age,&employees[counter].salary);
	}
	for(totalsalary=0,index=0;index<count;index++){
		totalsalary +=employees[index].salary;
	}
	printf("Average of an emplloyee is : %f\n",(float)totalsalary/count);
	getch();
}
