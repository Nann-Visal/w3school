#include<iostream>
using namespace std;
//base class
class mybaseclass{
	public:
		void myfunction()
		{
			cout<<"Some content in parent class\n";
		}
};
//another base class
class myanotherbaseclass{
	public:
		void myotherfunction(){
			cout<<"Some content in another class";
		}
};
//derived class
class myderivedclass:public mybaseclass,public myanotherbaseclass{
	
};
int main(){
	myderivedclass myobj;
	myobj.myfunction();
	myobj.myotherfunction();
	return 0;
}
