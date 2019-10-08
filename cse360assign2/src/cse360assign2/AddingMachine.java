/*
 * Author: Xinya Qi
 * classID: CSE360 70641
 * Assignment number: Assignment 2
 * Description: This is a class about AddingMachine.
 * URL: https://github.com/xinyaqi0519/cse360assign2.git
 * 
 */
package cse360assign2;
public class AddingMachine {
	
	private int total;
	private String history = "0";
	
	/**
	 * @description: This is AddingMachine method which for clarity purpose.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return {int}
	 * @description: Gets the total.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value {int}
	 * @description: This method is add the parameter to the total variable.
	 */
	public void add (int value) {
		
		total = total + value;
		history = history + " + " + value;
		
	}
	
	/**
	 * 
	 * @param value {int}
	 * @description: This method is subtract the parameter to the total variable.
	 */
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value;
		
	}
	
	/**
	 * 	@description: Return operations in string.
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * @description: Clear all operations happened.
	 */
	public void clear() {
		total = 0;
		history = "0";
		
	}
}
