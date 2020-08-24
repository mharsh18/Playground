#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,a1;
  float b1,c1,d1;
  cin>>a>>b>>c>>d;
  a1=a/6;
  b1=float(d%6)/10.0+d/6;
  c1=c/b1;
  d1=float(b)/a1;
  cout<<a1<<"\n";
  cout<<b1<<"\n";
  cout<<fixed<<setprecision(1)<<c1<<"\n";
  cout<<d1<<"\n";
  if(c1<d1)
    cout<<"Not Eligible to Win";
  else cout<<"Eligible to Win";
}