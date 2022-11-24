#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct person{
	int age;
	float weight;
	char name[30];
};
void main(){
	struct person *ptr;
	int i , num;
	printf("Enter number of persons: ");
	scanf("%d",&num);
	ptr = (struct person*) malloc(num * sizeof(struct person));
	
	for(i=0;i<num;++i){
		printf("Enter name , age , weight  of person respectively:\n");
		scanf("%s%d%f",&(ptr+i)->name, &(ptr+i)->age , &(ptr+i)->weight);
	}
	printf("Display Information : \n");
	
	for(i=0;i<num;++i){
		printf("%s\t%d\t%f",(ptr+i)->name,(ptr+i)->age,(ptr+i)->weight);
	}
	getch();
}
