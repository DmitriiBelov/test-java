// test_cons.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

template <typename T1, typename T2>
T2 printArr(const T1 * array, int i) {
	int count = 0;
	for (int j=0; j<i; j++) {
		cout << array[j] << " ";
		count++;
	}
	cout << endl;
	return count;
}

int main(int argc, char* argv[])
{
	const int iSize = 3, cSize = 5;

	int i_arr[iSize] = {10, 33, 55};
	char c_arr[cSize] = {"Hii!"};

	cout << "count: " << printArr<int, int>(i_arr, iSize) << endl;
	cout << "count: " << printArr<char, int>(c_arr, cSize) << endl;

	return 0;
}

