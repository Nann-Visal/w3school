#include<iostream>
using namespace std;
class myclass{
	private:
		int salary;
	public:
		void setsalary(int s){
			salary=s;
		}
		int getsalary(){
			return salary;
		}
};
int main(){
	myclass myobj;
	myobj.setsalary(5000);
	cout<<myobj.getsalary();
	return 0;
}
