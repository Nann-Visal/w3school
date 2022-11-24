#include<stdio.h>
#include<conio.h>
typedef struct {
	int age;
	float weight;
}person;
void main(){
	person *personPtr , person1;
	personPtr = &person1;
	
	printf("\nEnter age :");
	scanf("%d",&(*personPtr).age);
	printf("\nEnter weight : ");
	scanf("%f",&(*personPtr).weight);
	printf("\nDisplaying\n ");
	printf("%d\n%f\n",(*personPtr).age,(*personPtr).weight);
	printf("%d\n%f\n",personPtr->age,personPtr->weight);
	getch();
}

