#include<iostream>
using namespace std;
class myclass{
	public:
		void mymethod();
};
//set method outside class
void myclass::mymethod(){
	cout<<"Hello world";
}
int main(){
	myclass myobj;
	myobj.mymethod();
	return 0;
}
