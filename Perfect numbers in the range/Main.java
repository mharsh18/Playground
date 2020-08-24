#include <iostream>
using namespace std;
bool perno(int a){
  int count =1;
  for(int j=2;j<a;j++)
    if(a%j==0)
      count+=j;
  return count==a;
}
int main() 
{
   // Try out your code here
    int a,b;
  	cin>>a>>b;
  	for(int i=a+1;i<=b;i++)
      if(perno(i))
        cout<<i<<" ";
    return 0;
}