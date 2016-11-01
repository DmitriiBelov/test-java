// test_cons.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;


int main(int argc, char* argv[])
{
	int value = 8;
	int &ref = value;

	cin >> ref;
	cout << value << " - " << ref << endl;

	return 0;
}

