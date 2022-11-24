#include<iostream>
#include<string>
using namespace std;
class myclass{
	public:
		string brand;
		string model;
		int year;
		//construtor has parameters
		myclass(string x,string y, int z){
			brand=x;
			model=y;
			year=z;
		}
};
int main(){
	myclass myobj1("BMW","5X",2021);
	myclass myobj2("Ford","Mustang",2020);
	//print value
	cout<<myobj1.brand<<" "<<myobj1.model<<" "<<myobj1.year<<"\n";
	cout<<myobj2.brand<<" "<<myobj2.model<<" "<<myobj2.year<<"\n";
	return 0;
	
}
