#include<stdio.h>
struct Person
{
     char name[50];
     int id;
     float salary;
     char sex;
}person1,person2;
int main()
{
     printf("ID=");
     scanf("%d",&person1.id);
     printf("SEX=");
     scanf("\n%c",&person1.sex);
     printf("Salary=");
     scanf("%f",&person1.salary);

     return 0;

}
