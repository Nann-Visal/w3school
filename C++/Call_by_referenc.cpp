#include<iostream>
using namespace std;
void swapNum(int &x, int &y){
	int z=x;
	x=y;
	y=z;
}
int main()
{
	int fnum=20;
	int snum=21;
	 cout << "Before swap: " << "\n";
     cout << fnum << snum << "\n";
    swapNum( fnum,  snum);
     cout << "After swap: " << "\n";
     cout << fnum << snum << "\n";
	return 0;
}
