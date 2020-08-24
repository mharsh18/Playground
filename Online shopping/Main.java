#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int a1,b1,c1;
  a1=a*((100-float(b))/100)+c;
  b1=d*((100-float(e))/100)+f;
  c1=g*((100-float(h))/100)+i;
  cout<<"In Flipkart Rs."<<a1<<"\nIn Snapdeal Rs."<<b1<<"\nIn Amazon Rs."<<c1<<"\n";
  int d1=min(min(a1,b1),c1);
  if (d1==a1) cout<<"He will prefer Flipkart";
  else if(d1==b1) cout<<"He will prefer Snapdeal";
  else cout<<"He will prefer Amazon";
}