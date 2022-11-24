#include<iostream>
#include<string>
using namespace std;
class Car{
	public:
		string brand;
		string model;
		int year;
};
int main()
{
	Car car1;
	car1.brand = "BMW";
	car1.model = "X5";
	car1.year = 2021;
	cout<<car1.brand<<"\n"<<endl;
	cout<<car1.model<<"\n"<<endl;
	cout<<car1.year<<"\n"<<endl;
	return 0;
}
