#include <iostream>
using namespace std;
bool perno(int a){
  int count=1;
  for(int j=2;j<a;j++){
    if(a%j==0)
      count+=j;
  }
  return count==a;
}
int main() 
{
   // Try out your code here
    int a,b,c;
  	cin>>a>>b;
  	c=a+b;
  	if(perno(c))
      cout<<"They can read the message";
  	else
      cout<<"They can't read the message";
    return 0;
}