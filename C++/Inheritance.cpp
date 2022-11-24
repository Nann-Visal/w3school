#include<iostream>
#include<string>
using namespace std;
//base class
class vehicle{
	public: 
		string brand="Ford";
		void hond(){
			cout<<"Tuut , tuut!!\n";
		}
};
//derived class
class Car:public vehicle{
	public:
		string model="Mustang";
};
int main()
{
	Car mycar;
	mycar.hond();
	cout<<mycar.brand+ " " + mycar.model;
	return 0;
}
