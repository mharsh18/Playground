#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int sw,rw;
  	cin>>rw>>sw;
  	if(rw>sw)
      cout<<"Yes, you can enter.";
  	else if(rw==sw)
      cout<<"Yes, you can enter. Kindly use a rope.";
  	else
    	cout<<"Sorry, you can't enter";
    return 0;
}