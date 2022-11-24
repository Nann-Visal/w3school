#include<stdio.h>
#include<conio.h>
struct info{
	long int accntNum;
	char name[25];
	float balance;
};
void main(){
	struct info client[25], temp;
	int i , j , min , numClient;
	
	printf("Welcome to Client Account Infomation Services\n\n");
	printf("Input Number of Client to be Used:");
	scanf("%d",&numClient);
	for(i=0;i<numClient;i++){
		printf("Enter Account Number:",i+1);
		scanf("%d",&client[i].accntNum);
		fflush(stdin);
		printf("Enter Last Name:",i+1);
		gets(client[i].name);
		fflush(stdin);
		printf("Enter Belance:",i+1);
		scanf("%f",&client[i].balance);
}
		for(i=0;i<numClient;i++){
			min = i;
	        
			for(j=i+1;j<numClient;j++){
				if(client[j].accntNum<client[min].accntNum)
				min = j;
			}
				temp = client[i];
				client[i]=client[min];
				client[min]=temp;
			}
		printf("\nAccount                     LastName                 Balance");
        for(i=0;i<numClient;i++){
        	printf("\n%7d  %17s   %15.2f  ",client[i].accntNum,client[i].name,client[i].balance);
		}
		printf("\n");
		getch();
	
}
