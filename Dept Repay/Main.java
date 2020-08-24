#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,ri,y;
  cin>>p>>ri>>y;
  float si,amt,dis,fin;
  si=(p*ri*y)/100;
  amt=p+si;
  dis=0.02*si;
  fin=amt-dis;
  cout<<si<<"\n"<<amt<<"\n"<<dis<<"\n"<<fin<<"\n";
  return 0;
  
}