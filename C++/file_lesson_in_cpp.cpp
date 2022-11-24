#include<iostream>
#include<fstream>
#include<string>
using namespace std;
int main(){
	//create a text file
	ofstream MywriteFile("filename.txt");
	//write to the file
	MywriteFile<<"I can write here!!!!!!!!!!!!";
	//close file
	MywriteFile.close();
	// Create a text string, which is used to output the text file
	string myText;
	//read file
	ifstream MyreadFile("filename.txt");
	// Use a while loop together with the getline() function to read the file line by line
	while(getline(MyreadFile,myText)){
		//output the text from the file
		cout<<myText;
	}
	//close the file
	MyreadFile.close();
	
	return 0;
}
