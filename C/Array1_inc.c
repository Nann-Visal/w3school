#include<stdio.h>
int main()
{
     int m;
     int n;
     printf("Input m=");
     scanf("%d",&m);
     printf("Input n=");
     scanf("%d",&n);
    int x[m][n];
    int y[m][n];
    int z[m][n];
    int row,col;
    for(row=0;row<m;row++){
     for(col=0;col<n;col++){
          printf("x[%d][%d]=",row,col);
          scanf("%d",&x[row][col]);
     }
    }
    printf("------------------------------------\n");

      for(row=0;row<m;row++){
     for(col=0;col<n;col++){
          printf("y[%d][%d]=",row,col);
          scanf("%d",&y[row][col]);
     }
    }



     return 0;
}
