#include<iostream>
#include<vector>
#include<cstdlib>
struct Entry{
    std::string name;
    int number;
};
Entry phone_book[1000];
void print_entry(int i)
{
    std::cout<<phone_book[i].name<<" "<<phone_book[i].number<<'\n';
}
void add_entries(int n)
{
    phone_book.resize(phone_book.size()+n);
}
int main()
{
    return 0;
}