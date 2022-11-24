#include<stdio.h>
main()
{
    int i = 3 ;
    printf("\nAddress of i = %u",&i);
    printf("\nValueof i = %d",i);
    printf("\nValue of i = %d",*(&i));
}
