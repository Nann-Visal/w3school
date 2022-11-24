#include<iostream>
#include<string>
using namespace std;
//parent class
class myclass{
	public:
		void myfunction(){
			cout<<"Some content in parent class";
		}
};
//child class
class mychild:public myclass{
	
};
//grandchild class
class mygrandchild:public myclass{
	
};
int main()
{
	mygrandchild myobj;
	myobj.myfunction();
	return 0;
}
