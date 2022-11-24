#include<iostream>
using namespace std;
int main()
{
	char myCh[5]={'A','B','C'};
	myCh[3]='D';
	myCh[4]='E';
	for(int i=0;i<5;i++){
	
	cout<<myCh[i]<<"\n"<<endl;
}
	return 0;
}
