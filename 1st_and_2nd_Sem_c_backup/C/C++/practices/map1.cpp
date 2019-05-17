#include<unordered_map>
#include<iostream>
using namespace std;
int main(){
  unordered_map<int,int,int>mp;
  mp[5]=12;
  mp[4]=14;
  mp[6]=17;
  cout<<mp[5]<<' '<<mp[4]<<' '<<mp[6]<<endl;//prints: 12 14
}