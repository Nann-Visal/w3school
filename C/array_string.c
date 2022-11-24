#include<stdio.h>
#include<conio.h>
void sorting(int x[] , int n)
{
	int i,j,temp;
	for(i=1;i<n-1;i++)
	for(j=0;j<n-1;j++){
		if(x[j]>x[j+1]){
			temp=x[j];
			x[j]=x[j+1];
			x[j+1]=temp;
		}
	}
	for(i=0;i<n;i++){
		printf("%d\t",x[i]);
	}
}
void main()
{
	int a[]={34,10,84,21,8,76,56};
	sorting(a,7);
	getch();
}
