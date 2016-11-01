// test_cons.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

const int arr_length =3;


int main(int argc, char* argv[])
{
	int *iArr = new int[6];
	for(int i=0;i<6;i++)
		iArr[i]=i*i;
	for(i=0;i<6;i++)
		cout << iArr[i] << " ";
	delete [] iArr;

	return 0;
}

