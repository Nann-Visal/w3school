#include<stdio.h>
#include<conio.h>
void main()
{
     int n;
     int sn = 0;
     printf("Computing sn=...........\n");
     printf("Enter n :");
     scanf("%d",&n);
     if(n<1){
          printf("Invalid value!\n");


     }
     for(int i = 1; i<=n; i++)
          sn +=1;
     printf("Sn = %d\n",sn);

     return 0;
}
