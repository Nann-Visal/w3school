#include<conio.h>
#include<stdio.h>

struct Grade {
	char Name[10];
	int Grade[5];
	int Total;
};
// deffinition of Swap function
void swap(struct Grade *px , struct Grade *py){
	struct Grade temp;
	temp=*px;
	*px=*py;
	*py=temp;
}
void main()
{
	int i =0, j ,k , m , a , b , c , d ,count = 1;
	struct Grade classX[4];
	clrscr();
	while(1){
		printf("Enter Name of Next Student:");
		scanf("%s",&classX[i].Name);
		printf("Enter 5 Grade of %s",classX[i].Grade[m]);
		classX[i].Total=0;
		for(m=0;m<5;m++){
			scanf("%d",&classX[i].Grade[m]);
			classX[i].Total +=classX[i].Grade[m];
		}
		i++;
		count++;
		if(count>4) break;
	}
	for(j=0;j<count-1;j++){
		printf("\n%-15s",classX[j].Name);
		for(k=0;k<4;k++)
			printf("%d\t",classX[j].Grade[k]);
		printf("%d",classX[j].Total);
	}
		printf("\nAfter Sorting the List is As Below.\n");
		for(a=0;a<count-1;a++){
			for(b=0;b<count-2;b++)
				if(classX[b].Total<classX[b+1].Total);
				swap(&classX[b],&classX[b+1]);
			}
		for(c=0;c<count-1;c++){
			printf("\n%-15s",classX[c].Name);
			for(d=0;d=count-1;d++)
				printf("%d\t",classX[c].Grade[d]);
				printf("%d",classX[c].Total);
			
		}
		
	
	printf("\n");
	getch();
}
