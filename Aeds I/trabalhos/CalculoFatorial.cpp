#include<iostream>
using namespace std;

int fatorial(int n){
		if(n == 0)
			return 1;
		else
			
			cout <<  n  << " ";
			return n * fatorial(n-1);
}
int main(){
	cout << fatorial(10);
	
	return 0;
}
