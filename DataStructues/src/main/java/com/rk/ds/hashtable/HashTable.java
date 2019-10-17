package com.rk.ds.hashtable;

public class HashTable {
	Node[] hashTable;
	
	HashTable() {
		hashTable = new Node[10];
	}
	
	public void addKey(String key) {
		int index = hashfunction(key)%10;
		Node node = new Node();
		node.setKey(key);
		hashTable[index] = node;
	}
	
	public void removeKey(String key) {
		int index = hashfunction(key)%10;
		hashTable[index] = null;
	}
	
	public boolean searchKey(String key) {
		return false;
	}
	
	public int hashfunction(String key) {
		char[] charAry = key.toCharArray();
		int sum = 0;
		for(char ch:charAry) {
			sum += ch;
		}
		return sum;
	}
	
}

