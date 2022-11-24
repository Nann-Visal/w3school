#include<stdio.h>
#include<cstring.h>
#include<conio.h>
void main(){
	char *mem_allocation;
	//memory is allocated dynamically
	mem_allocation = (char*) malloc(20 * sizeof(char));
		if(mem_allocation==NULL){
			printf("Couldn't able to allocate requested memory\n");
		}
		else{
			strpy(mem_allocation, "Hello , World!");
		}
		printf("Dynamically allocated memory content:\n%s\n ",allocation);
	
		free(mem_allocation);
		getch();
}
