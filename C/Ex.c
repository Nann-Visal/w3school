#include<stdio.h>
int main(){
float Math, Khmer;
int i;
float x=0;
	  printf("Please input score Math: ");
	  scanf("%f", &Math);
	  printf("Please input score Khmer: ");
		  scanf("%f", &Khmer);
	x=(Math+Khmer)/2;
	printf("Answer= %.2f\n",x);
	
if(x<50){
	printf("fail");
}
else if(x<60){
	printf("E");
}
else if(x<70){
	printf("D");
}
else if(x<80){
	printf("C");
}
else if(x<90){
	printf("B");
}
else
    printf("A");
    
    return 0;
}

