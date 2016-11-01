// test_cons.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

const int arr_length =3;

template <class Type>

class Arr {
private:
	Type arr[arr_length];
public:
	Arr(Type *a) {
		for(int i=0; i<arr_length; i++)
			arr[i]=a[i];
	}
	Type getElement(int i) {
		return arr[i];
	}
};

int main(int argc, char* argv[])
{
	int arr1[]={12,23,45,6};
	Arr<int> obj(arr1);
	cout << obj.getElement(2) << endl;

	char arr2[]={"Mars!"};
	Arr<char> obj2(arr2);
	cout << obj2.getElement(0) << endl;

	return 0;
}

