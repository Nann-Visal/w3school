#include<iostream>
using namespace std;
class myClass{
	public:
		void myMethod();
};
void myClass::myMethod(){
    	
	cout<<"Hello World"<<endl;
}
int main(){
	myClass myObjrct;
	myObjrct.myMethod();
	return 0;
}
