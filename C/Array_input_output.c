#include<iostream>
using namespace std;
class Person{
	private:
		int id;
		string name;
		string gender;
		string dob;
	public:
		Person(){
			id=0;
			name="NULL";
			gender="NULL";
			dob="NULL";
		}
		Person(int id,string name,string gender,string dob){
			this->id=id;
			this->name=name;
			this->gender=gender;
			this->dob=dob;
		}
		void inputPerson(){
			cout<<"Input ID = "<<;cin>>id;
			cout<<"Input Name = "<<;cin>>name;
			cout<<"Input Gender = "<<;cin>>gender;
			cout<<"Input DOB = "<<;cin>>dob;
		}
		void outputPerson(){
			cout<<"ID = "<<id<<endl;
			cout<<"Name = "<<name<<endl;
			cout<<"Gender = "<<gender<<endl;
			cout<<"Dob = "<<dob<<endl;
		}
};
class Student: public Person{
	private:
		float score1;
		float score2;
		float score3;
	public:
		Student(){
			score1=0;
			score2=0;
			score3=0;
			Person:Person();
		}
		Student(float score1,float score2,float score3,int id,string name,string gender,string dob){
			this->score1=score1;
			this->score2=score2;
			this->score3=score3;
			Person::Person(id,name,gender,dob);
		}
		void inputStudent(){
			cout<<"Input score1 : ";cin>>score1;
			cout<<"Input score2 : ";cin>>score2;
			cout<<"Input score3 : ";cin>>score3;
			Person::inputPerson();
		}
		void outputStudent(){
			cout<<"Score1 = "<<score1<<endl;
			cout<<"Score2 = "<<score2<<endl;
			cout<<"Score3 = "<<score3<<endl;
			Person::outputPerson();
		}
};
int main(){
	Student stu;
	stu.outputStudent();
	stu.inputStudent();
	stu.outputStudent();
	return 0;
}
