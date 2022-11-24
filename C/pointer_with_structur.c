#include<stdio.h>
#include<conio.h>
#include<string.h>
//declaration struct Books
struct Books {
	char title[50];
	char author[50];
	char subject[100];
	int book_id;
};
//functoin declaration
void printBook(struct Books *book);//pointer of type struct
void main(){
	struct Books Book1;
	struct Books Book2;
	
	strcpy(Book1.title,"C programming");
	strcpy(Book1.author,"Nann Visal");
	strcpy(Book1.subject,"C programming tutorail");
	Book1.book_id = 12345678;
	//call function
	printBook(&Book1);
	
		
	strcpy(Book2.title,"Java programming");
	strcpy(Book2.author,"Nann Visal");
	strcpy(Book2.subject,"Java programming tutorail");
	Book2.book_id = 87654321;
	//call function
	printBook(&Book2);
}
void printBook(struct Books *book){
	printf("\nBook title : %s\n",book->title);
	printf("\nBook author : %s\n",book->author);
	printf("\nBook subject : %s\n",book->subject);
	printf("\nBook book_id : %d\n",book->book_id);
}
