#include<iostream>
using namespace std;
#include"practice_treenode.h"

treenode<int>* takeinput(){
	int rootdata;
	cout << "enter data :" ;
	cin >> rootdata;
	treenode<int>* root = new treenode<int>(rootdata);
	
	int n;
	cout << "enter no. of children of " << rootdata << ":" ;
	cin >> n;
	for (int i = 0; i < n; i++) {
		treenode<int>* child = takeinput();
		root-> children.push_back(child);
	}
	return root;
}

void print(treenode<int>* root){
	cout << root->data<<":";
	for (int i = 0; i < root->children.size(); i++){
		cout << root -> children[i] -> data << ",";
	}
	cout << endl;
	for (int i = 0; i < root->children.size(); i++) {
		print(root->children[i]);
	}
}

int main() {
	treenode<int>* root = takeinput();
	print(root);
	
}
