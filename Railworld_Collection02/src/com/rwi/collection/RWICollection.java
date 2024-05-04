package com.rwi.collection;

import java.util.Arrays;

public class RWICollection {

	private Object[] elementData;
	private int elementCount;

	public RWICollection() {
		elementData = new Object[10];
		elementCount = 0;
	}

	public void add(Object obj) {
		if (size() == capacity()) {
			grow();
		}
		this.elementData[elementCount++] = obj;
	}

	private void grow() {
		// create new Object array
		Object[] nextArray = new Object[capacity() * 2];
		//copy old element array to new aaray
		  for(int i=0;i<elementData.length;i++) {
			  nextArray[i]=elementData[i];
		  }
		  elementData=nextArray;
	}

	public int capacity() {
		return elementData.length;
	}

	public int  size() {
		// TODO Auto-generated method stub
		return elementCount+1;
	}
	
	public Object  get(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return elementData[index];
	}
	public void remove(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
	
		for(int i=index;i<elementCount-1;i++) {
			elementData[i]=elementData[i+1];
		}
		elementCount--;
	}
	
@Override
public String toString() {
	String str=new String("[");
	 for(int i=0;i<elementCount;i++) {
	 str=str.concat(
			 elementData[i]!=null
			 ?elementData[i].toString()
			 :"null");
	  str=str.concat(" ");
	 }
	 str=str.trim();
	 str=str.replace(" ", ",");
	 str=str.concat("]");
  return str;	 
}
}