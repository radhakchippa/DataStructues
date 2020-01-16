package com.rk.ds;

import java.util.Arrays;

public class ArraysDemo {

	int origArray[] = new int[10];
	int elementsInAry = 0;
	
	//either double or half the array size depending on elementsInArray;
	public int[] resizeArray() {
		if(elementsInAry <= origArray.length/4) {
			// half origArray size;
			int[] newAry = new int[origArray.length/2];
			newAry = Arrays.copyOf(origArray, origArray.length/2);
			return newAry;
		}
		
		if(elementsInAry == origArray.length) {
			//double origArray size;
			int[] newAry = new int[2*origArray.length];
			newAry = Arrays.copyOf(origArray, 2*origArray.length);
			return newAry;
		}
		
		return origArray;
	}
	
	public int[] insertElement(int position, int value) {
		origArray = resizeArray();
		if(position >= origArray.length) {
			return origArray;
		}
		if(elementsInAry <= position)
			origArray[position] = value;
		else {
			for(int i = origArray.length-2; i < position; i--) {
				origArray[i+1]=origArray[i];
			}
		}
		elementsInAry ++;
		return origArray;
	}
	
	public void removeElement(int position) {
		origArray = resizeArray();
		for(int i = position; i< origArray.length-1; i++) {
			origArray[i] = origArray[i+1];
		}
		elementsInAry--;
	}
	
	public void printArray(int[] origArray) {
		Arrays.stream(origArray).forEach(x -> System.out.print(x +" ") );
		System.out.println("- elements in Array:"+elementsInAry);
	}
	
	public static void main(String[] args) {
		ArraysDemo demo = new ArraysDemo();
		demo.printArray(demo.origArray);
		demo.origArray = demo.insertElement(0, 1);
		demo.printArray(demo.origArray);
		demo.insertElement(1, 2);
		demo.printArray(demo.origArray);
		demo.insertElement(2,3);
		demo.printArray(demo.origArray);
		demo.insertElement(3,4);
		demo.printArray(demo.origArray);
		demo.removeElement(0);
		demo.printArray(demo.origArray);
		demo.removeElement(1);
		demo.printArray(demo.origArray);
		demo.insertElement(3,5);
		demo.printArray(demo.origArray);
		
	}

}
