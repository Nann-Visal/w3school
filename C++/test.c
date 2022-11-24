#include<stdio.h>
int main()
{

     int ears=0;
     int j;
     int n;
     printf("Input number rabbit n= ");
     scanf("%d",&n);

     for(j=1;j<=n;j++)
     {

          if(j%2==0)
          {ears=(ears+2);
          }
          else(j%2!==0){
          ears=(ears+3);
          }


      printf("\nEars is rabbit=%d",ears);

     return 0;
}
