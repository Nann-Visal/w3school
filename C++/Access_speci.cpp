#include<iostream>
using namespace std;
//Base class
class Employee{
	protected:
		int salary;
};
//Derived class
class Programmer:public Employee{
	public:
		int bonus;
		void setsalary(int s){
			salary = s;
		}
		int getsalary(){
			return salary;
		}
};
int main(){
	Programmer myobj;
	myobj.setsalary(50000);
	myobj.bonus=15000;
	cout<<"Salary:"<<myobj.getsalary()<<"\n";
	cout<<"Bonus:"<<myobj.bonus<<"\n";
	return 0;
}
