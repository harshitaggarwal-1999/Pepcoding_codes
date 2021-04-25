#include<iostream>
#include<queue>
using namespace std;
#include"practice_treenode.h"

treenode<int>* takeinputlevelwise(){
	int rootdata;
	cout << "enter data: " ;
	cin >> rootdata;
	treenode<int>* root = new treenode<int>(rootdata);
	queue<treenode<int>*> pendingnodes;
	pendingnodes.push(root);
	while(!pendingnodes.empty()) {
		treenode<int>* front = pendingnodes.front();
		pendingnodes.pop();
		
//		cout << "enter" << i << "th child of " << front-> data << " : ";
		cout << "enter the no. of children of " << front-> data << ": ";
		int numchild;
		cin >> numchild;
		for (int i = 0; i< numchild; i++) {
			int childdata;
			cout << "enter the " << i << "th child of " << front -> data<< ": ";
			cin >> childdata;
			treenode<int>* child = new treenode<int>(childdata);
			front->children.push_back(child);
			pendingnodes.push(child);
		}
		
	}
	return root;
}

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
	treenode<int>* root = takeinputlevelwise();
	print(root);
	
}
