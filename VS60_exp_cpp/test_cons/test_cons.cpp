// test_cons.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

class Person;

class Dog {
	friend class Person;
public:
	Dog() {
		health = 100;
	};
private:
	int health;
};

class Person {
public:
	void Damage (Dog &d) {
		d.health -= 20;
		cout << "Health is: " << d.health << endl;
	}

	void Kill (Dog &d) {
		d.health = 0;
		cout << "Health is: " << d.health << endl;
	}

	void Heal (Dog &d) {
		d.health += 30;
		cout << "Health is: " << d.health << endl;
	}
};

int main(int argc, char* argv[])
{
	Dog skuby;
	Person Volodya;
	Volodya.Damage(skuby);
	Volodya.Kill(skuby);
	Volodya.Damage(skuby);
	Volodya.Heal(skuby);

	cout << endl;
	Dog haski;
	Volodya.Damage(haski);

	return 0;
}

