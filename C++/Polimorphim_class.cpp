#include<iostream>
#include<string>
using namespace std;
class animal{
	public:
		void animalsound(){
			cout<<"the animal make a sound\n";
		}
};
class pig : public animal{
	public: 
		void animalsound(){
			cout<<"the pig say: we we we\n";
		}
};
class dog : public animal{
	public:
		void animalsound(){
			cout<<"the dog say: bow bow bow\n";
		}
};
int main(){
	animal myanimal;
	myanimal.animalsound();
	pig mypig;
	mypig.animalsound();
	dog mydog;
	mydog.animalsound();
	return 0;
}
