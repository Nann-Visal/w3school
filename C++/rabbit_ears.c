#include<stdio.h>
int main()
{
     int j=1;
     int s=0;
     int n;
     printf("Input Rabbit Number:");
     scanf("%d",&n);
     for(j=1;j<=n;j++){
          if(j%2==0){
               s=s+2;
          }
          else
          {
               s=s+3;
          }
     }
     printf("\nEars-Rabbit=%d",s);
     return 0;
}
