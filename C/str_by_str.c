#include<stdio.h>
#include<conio.h>
struct student_college_detail{
	int college_id;
	char college_name[50];
};
struct student_detail{
	int id;
	char name[20];
	float percentage;
	//struct by struct
	struct student_college_detail clg_data;
}stu_data,*stu_data_ptr;
void main(){
	struct student_detail stu_data= { 1,"Visal",90.5,71145,"Royal University of Phnom Penh"};
	stu_data_ptr = &stu_data;
	printf("Id is : %d\n",stu_data_ptr->id);
	printf("Name is : %s\n",stu_data_ptr->name);
	printf("Percenrtage is : %f\n",stu_data_ptr->percentage);
	printf("college Id is : %d\n",stu_data_ptr->clg_data.college_id);
	printf("College Name is : %s\n",stu_data_ptr->clg_data.college_name);
	
	getch();
}
