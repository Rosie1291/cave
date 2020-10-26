/**
 * Name: Nhung Nguyen  
 * Date: 10/25/2020
 * Class: CS 226 009 Data Structures and Algorithms
 * Assignment6: Chapter 6: Caves
 * Purpose:  Interface containing method definition to add and remove caves

 */
package nnguyen;
public interface CaveInterface<T> {
	
	/**
	 * Adds a new entry to the top of this stack.
	 * @param newEntry An object to be added to the stack.
	 */
	public void push(T anEntry, double longitude, double latitude );
	
	/**
	 * Removes and returns this stack's top entry.
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty before the operations.
	 */
	public T pop();
	
	/**
	 * Retrieves this stack's top entry.
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty.
	 * @return
	 */
	public T peek();
	
	/**
	 * Detects whether this stack is empty.
	 * @return True if the stack is empty.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Removes all entries from this stack.
	 */
	public void clear();
	
}
