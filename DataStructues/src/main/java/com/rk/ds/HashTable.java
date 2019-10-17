package com.rk.ds;

public class HashTable {
	String[] hashTable;
	
	HashTable() {
		hashTable = new String[10];
	}
	
	public void addKey(String key) {
		
	}
	
	public void removeKey(String Key) {
		
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

