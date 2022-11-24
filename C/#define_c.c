#include<stdio.h>
#include<conio.h>

#define height 100 // asign value 100 to height
#define number 3.14 // asing value 3.14 to number
#define letter 'A' // asing value  A to letter
#define letter_sequence "ABC" // asing value  ABC to letter_sequence
#define backslash_char '\?' // asing value  \? to backslash_char

void main()
{
	printf("\nValue of : %d",height);
	printf("\nValue of : %f",number);
	printf("\nValue of : %c",letter);
	printf("\nValue of : %s",letter_sequence);
	printf("\nValue of : %c",backslash_char);
	
	getch();
}
