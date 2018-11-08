#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include <memory>

class Animal
{
	public:
		void getFamily()
		{
		    std::cout<<"We are animals = "<<std::endl;
		}
	
		virtual void getClass 
		{
		    std::cout<<"I'm an animal"<<std::endl;
		}
		
};

class Dog : public Animal
{
	public:
		void getClass
		{
		    std::cout<<"I'm a dog"<<std::endl;
		}
};
int main()
{
	auto animal = std::make_shared<Animal>();
	auto dog = std::make_shared<Dog>();
	
	if(animal)
	{
	    animal->getClass();
	}
	
	if(dog)
	{
	    dog->getClass();
	}
	
	return 0;
}
