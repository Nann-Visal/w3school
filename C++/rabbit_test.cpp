#include<iostream>
using namespace std;
int main()
{
     int n;
     int s=0;
     int j=1;
     cout<<"Number of Rabbit n="<<n<<endl;
     cin>>n;
     start:
     for(j=1;j<=n;j++){
          if(j%2==0){
               s=s+2;
               cout<<"Ears-Rabbit s="<<s;
          }
          goto start;
          if(j%2!==0){
               s=s+3;
               cout<<"Ears-Rabbit s="<<s;
          }
     }
     return 0;
}
