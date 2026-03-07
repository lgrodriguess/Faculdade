#include<iostream>
using namespace std;

void impar(){
	for(int i = 1; i<=50; i++){
		if(i %2 !=0){
			cout<<i<<endl;
		}	
	}
}
int main(){
	impar();
	return 0;
}
