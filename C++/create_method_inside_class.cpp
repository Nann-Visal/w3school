#include<iostream>
using namespace std;
class myclass{
	public:
		//create method
		void mymethod(){
			cout<<"Hello world";
		}
};
int main(){
	myclass myobj;
	//call method
	myobj.mymethod();
	return 0;
}
