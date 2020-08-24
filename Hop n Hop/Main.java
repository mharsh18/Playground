#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  float dist;
  dist=sqrt((a-3)*(a-3)+(b-4)*(b-4));
  cout<<int(dist);
  return 0;
}