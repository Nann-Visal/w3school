#include<iostream>
#include<string>
using namespace std;
int main()
{
	string food="PIZZA";
	string* ptr=&food;
	cout<<ptr<<"\n"<<endl;
	cout<<&food<<"\n"<<endl;
	return 0;
}
