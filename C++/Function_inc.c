#include<stdio.h>
// function prototype
sayhello(int count);
main()
{
     sayhello(4);
}
sayhello(int count)
{
     int c;
     for(c=0;c<count;c++)
          printf("Hello\n");
}
