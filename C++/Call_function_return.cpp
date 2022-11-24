#include<iostream>
#include<string>
using namespace std;
int myfunction(int x, int y){
	return (x+y);
}
int main()
{
	int z;
	z=myfunction(3,9);
	cout<<z<<endl;
	return 0;
}
