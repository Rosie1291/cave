/**
 * Name: Nhung Nguyen  
 * Date: 10/25/2020
 * Class: CS 226 009 Data Structures and Algorithms
 * Assignment6: Chapter 6: Caves
 * Purpose:  Stack implementation
 */

package nnguyen;

import java.util.EmptyStackException; 

public class CaveStack<T> implements CaveInterface<T> {

	private Cave topNode;
	private int numOfEntries;
	
	public CaveStack() {
		topNode = null;
	}
	
	public boolean checkDuplicate(double longitude, double latitude) {
		Cave currentNode = topNode;
		while(currentNode != null) {
			//compare 
			if (longitude == currentNode.getLongitude() && latitude == currentNode.getLatitude()) {
				return false;
			}
			//move i to the next linked cave
			currentNode = currentNode.getNextCave();
		}
		return true;
	}
	
	public T[] toArray() {
		T[] result = (T[]) new Object[numOfEntries];
		int i = 0;
		Cave currentNode = topNode;
		while ((i < numOfEntries) && (currentNode != null)) {
			result[i] = (T) currentNode.getCaveName();
			i++;
			currentNode = currentNode.getNextCave();
			}
		return result;
	}
	
	@Override
	public void push(T anEntry, double longitude, double latitude) {
		Cave newNode = new Cave((String) anEntry, topNode, longitude, latitude);
		topNode = newNode;
		numOfEntries++;
	}

	@Override
	public T pop() {
		T top = peek();
		topNode = topNode.getNextCave();
		numOfEntries--;
		return top;
	}

	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		else
			return (T) topNode.getCaveName();
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public void clear() {
		topNode = null;
	}

	

}

	