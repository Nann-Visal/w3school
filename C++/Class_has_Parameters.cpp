#include<iostream>
using namespace std;
class myclass{
	public:
		int speed(int maxspeed);
};
int myclass::speed(int maxspeed){
	return maxspeed;
}
int main(){
	myclass Object;
	cout<<Object.speed(200);
	return 0;
}
