package com.rk.ds.queue;


//FirstInFirstOut.
public class QueuesWithResizableArray {
	Integer[] myAry = new Integer[10];
	int size = 0;
	
	public int peek() {
		return (myAry[0]!=null)? myAry[0]: -1;
	}
	
	public void enqueue(Integer key) {
		if(size < myAry.length) {
			myAry[size] = key;
			size++;
		} else {
			myAry = resizeAry(key);
		}
	}
	
	public Integer dequeue() {
		if(size > 0) {
			for(int i =1;i< size-1;i++)
				myAry[i] = myAry[i+1];
			myAry[size]=-1;
			size--;
			return myAry[0];
		} else {
			return -1;
		}
	}
	
	public Integer[] resizeAry (Integer key) {
		Integer[] newAry = new Integer[2*myAry.length];
		for(int i =0; i< myAry.length;i++) {
			newAry[i] = myAry[i];
		}
		newAry[myAry.length]= key;
		size++;
		return newAry;
	}
	
	public static void main(String...strings) {
		QueuesWithResizableArray queue = new QueuesWithResizableArray();
		System.out.println("starting Queue.. tests.");
		for(int i =0;i<10;i++)
			queue.enqueue(i);
		System.out.println("Dequeue ....");
		System.out.println("Dequeue - 0 :"+queue.dequeue());
		System.out.println("Dequeue - 1 :"+queue.dequeue());
		System.out.println("Dequeue - 2 :"+queue.dequeue());
		System.out.println("Dequeue - 3 :"+queue.dequeue());
		System.out.println("Dequeue - 4 :"+queue.dequeue());
		System.out.println("Dequeue - 5 :"+queue.dequeue());
		System.out.println("Dequeue - 6 :"+queue.dequeue());
		System.out.println("Dequeue - 7 :"+queue.dequeue());
		System.out.println("Dequeue - 8 :"+queue.dequeue());
		System.out.println("Dequeue - 9 :"+queue.dequeue());
	}
}
