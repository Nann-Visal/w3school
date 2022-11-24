#include<stdio.h>
#include<conio.h>
void main(){
	int a[3][4];
	int i,j;
	printf("Enter Value\n");
	for(i=0 ; i<3 ; i++)
	 for(j=0 ; j<4 ; j++){
	 	printf("Enter Value:");
	 	scanf("%d",&a[i][j]);
	 }
	 printf("You have enter all the value\n");
	 for(i=0;i<3;i++){
	 	for(j=0;j<4;j++)
	 	 printf("%d",a[i][j]);
	 	 printf("\n");
	 }
	 getch();
}
