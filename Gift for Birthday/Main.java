#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int yob;
  cin>>yob;
  if (yob%4==0)
    cout<<yob<<" is a leap year";
  else
    cout<<yob<<" is not a leap year";
  return 0;
}