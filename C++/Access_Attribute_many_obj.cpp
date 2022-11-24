#include<iostream>
#include<string>
using namespace std;
//Create class 
class car{
	//Access specifier
	public:
		//Attribute
		string brand;
		string model;
		int year;
};
//main function
int main()
{
	//create object and set value
	car obj1;
	obj1.brand="BMW";
	obj1.model="X5";
	obj1.year=2021;
	//create object and set value
	car obj2;
	obj2.brand="Ford";
	obj2.model="Mustang";
	obj2.year=2020;
	//print value
	cout<<obj1.brand<<"\n";
	cout<<obj1.model<<"\n";
	cout<<obj1.year<<"\n";
	cout<<"---------------------------------\n";
	cout<<obj2.brand<<"\n";
	cout<<obj2.model<<"\n";
	cout<<obj2.year<<"\n";
	return 0;
}
