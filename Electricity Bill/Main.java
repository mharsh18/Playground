#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,cost;
  cin>>unit;
  if(unit<=200)
    cost = unit*0.5;
  else if(unit<=400)
    cost = unit*0.65 +100;
  else if(unit<=600)
    cost = unit*0.8 +200;
   else
     cost=unit*1.25 +425;
   cout<<"Rs."<<cost;
  return 0;
}