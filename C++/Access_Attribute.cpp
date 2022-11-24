#include<iostream>
#include<string>
using namespace std;
class myClass{// the class
	public:    // Access specifier
		int myNum; // Attribute
		string myString;  // Attribute
};
int main(){
	myClass myObj; //Create an object of myClass
	// Access attribute and set value
	myObj.myNum = 15;
	myObj.myString = "Some Text";
	//Print Value
	cout<<	myObj.myNum <<"\n";
	cout<<  myObj.myString;
	return 0;
}

