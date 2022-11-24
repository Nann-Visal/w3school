#include<stdio.h>
#include<string.h>
#include<conio.h>
struct Books {
	char title[50];
	char author[50];
	char subject[100];
	int book_id;
};
//function declaration
void printBook(struct Books book){
	printf("Book title : %s\n",book.title);
	printf("Book author : %s\n",book.author);
	printf("Book subject : %s\n ",book.subject);
	printf("Book book_id : %d\n",book.book_id);
}
//function main
void main(){
	struct Books Book1;
	struct Books Book2;
	
	strcpy(Book1.title,"C programming");
	strcpy(Book1.author,"Nann Visal");
	strcpy(Book1.subject,"C programming tutorial");
	Book1.book_id = 12345678;
	
	strcpy(Book2.title,"Java programming");
	strcpy(Book2.author,"Nann Visal");
	strcpy(Book2.subject,"Java programming tutorial");
	Book2.book_id = 87654321;
	
	printBook(Book1);
	printBook(Book2);
	
	getch();
}
