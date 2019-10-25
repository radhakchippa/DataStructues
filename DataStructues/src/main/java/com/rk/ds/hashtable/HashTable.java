package com.rk.ds.hashtable;

public class HashTable {
	Node[] hashTable;
	
	HashTable() {
		hashTable = new Node[10];
	}
	
	public void addKey(String key) {
		int index = hashfunction(key)%10;
		Node newNode = new Node();
		newNode.setKey(key);
		newNode.setNext(null);
		if(hashTable[index] == null) {
			hashTable[index] = newNode;
		} else {
			Node currentNode;
			do {
				currentNode = hashTable[index];
			} while(hasNext(currentNode));
			currentNode.setNext(newNode);
		}
	}
	
	public boolean hasNext(Node node) {
		if(node.getNext() == null)
			return false;
		else 
			return true;
	}
	
	public void removeKey(String key) {
		int index = hashfunction(key)%10;
		Node node = hashTable[index];
		do {
			if(node.getKey() == key) {
				hashTable[index]=node.getNext();
				break;
			}
		}while(hasNext(node));
	}
	
	public boolean searchKey(String key) {
		int index = hashfunction(key)%10;
		Node currentNode = hashTable[index];
		do {
			if(currentNode != null && currentNode.getKey() == key) {
				return true;
			}
		} while(hasNext(currentNode));
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

