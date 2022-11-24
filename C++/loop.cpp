#include<iostream>
using namespace std;
int main()
{
   int j=1;
   int s=0;
   int n;
   cout<<"\nInput Number of Rabbit:"<<endl;
   cin>>n;
   for(j=1;j<=n;j++){
     if(j%2==0)
          s+=2;
     else
          s+=3;
   }
   cout<<"Ears-Rabbit  =  "<<s<<endl;
   return 0;


}
