#include<iostream>
using namespace std;
class myclass{
	public:
		int mymethod(int value);
};
int myclass::mymethod(int value){
	return value;
}
int main(){
	myclass myobj;
	cout<<myobj.mymethod(2000);
	return 0;
}

