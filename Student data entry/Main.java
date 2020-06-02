#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
  std::cout<<"\nStudent Details"<<"\n";
  std::cin.getline(s1.name,50);
  std::cin>>s1.roll; std::cin>>s1.marks;
  std::cout<<"Name: "<<s1.name<<"\n"<<"Roll: "<<s1.roll<<"\n"<<"Marks: "<<s1.marks;
}