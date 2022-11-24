#include<stdio.h>
#include<math.h>
#include<string.h>
int main()
{
	int n;
	char h[n];
	int len;
	int d;
	int j;
	printf("Input Hexadecimal =");
	gets(h);
	len=strlen(h);
	
	for(j=0;j<n--;j++){
		
		d=h[n]*pow(16,len--);
	}
	int D;
	D+=d *pow(16,len--);
	if(d='A'||'B'||'C'||'D'||'E'||'F'){
		D+=(10||11||12||13||14||15 *pow(16,len--));
	}
	printf("Decimal =%d ",D);
	return 0;
}
