package liststuff;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> my_list = new LinkedList<String>();
		
		my_list.add("apple");
		my_list.add("orange");
		my_list.add("peach");
		my_list.add("plum");
		my_list.add("pear");
		
		ListIterator<String> listIterator = my_list.listIterator();
		int incrementor = 0 ;
        while (listIterator.hasNext()) {
            System.out.println("I am currently at: " + my_list.get(incrementor));
            // don't be confused by the line below.  next() simply gets the value of that position and advances the pointer 
            // to the next value in the linkedlist. 
            System.out.println(listIterator.next());
            incrementor ++; 
        }
        
        // LINKED LIST METHODS: 
        // my_list.get(2)  // returns element in slot 2. 
        // my_list.remove("peach");
        // my_list.remove(2) 
        // my_list.add("banana"); // inserts at end
        // my_list.add(3,"banana"); // inserts at designated position
        // my_list.indexOf("plum"); // returns 3
        // my_list.set(2, "mango"); // over-writes whatever was in slot 2 with "mango"  
		
	}
	
	public static void logTheList(LinkedList<String> the_list){
		// this method accepts a linkedlist as a parameter. 
		// using an iterator, simply log out each member of the linkedlist that is passed in. 
		// use line 20 as a guide for how to do this. 
		// copy and paste is totally fine! 
		
	}
	
	
	public static void swapTwo(LinkedList<String> the_list, String first, String second){
		// this method already takes three arguments: a linkedlist, and two strings. 
		// look at your toolkit that begins on line 28. 
		// use methods in that toolkit to swap two elements passed into the method. 
		// For now, only pass in elements that exist in the list. 
		// Call this method from the main class when it's finished. 
		// This should log out the new swapped list. 
		// Compare and contrast: how would this be different than swapping elements in an array?
		// Question: is the original list mutated by this action ? Provide proof of your answer. 
		
		System.out.println(the_list); 
		
	}
	
	public static void deleteIfFound(LinkedList<String> the_list, int target){
		// This method should delete an element from a LinkedList. 
		// Use the toolkit that starts on line 28. 
		// It should log out the new list with a deleted item. 
		
		System.out.println(the_list); 
		
	}
	
	public static void insertAfter(LinkedList<String> the_list, String target){
		// This method should insert an element after another element. 
		// Use the toolkit that starts on line 28. 
		// It should log out the new list with the recently inserted  item. 
		
		System.out.println(the_list); 
		
	}
	
	public static void sumUntilDone(LinkedList<Integer> the_list, int target){
		// STRETCH GOAL: 
		// in the Main method, Create a LinkedList of integers.  Use line 10 as a clue. 
		// from the Main method, call this method.  
		// This method should loop through the list and add all of the numbers up until the target number.
		// It should log out the sum of the numbers up until the target number. 
		
		int rolling_total = 0 ; 
		int incrementor = 0;
		
		System.out.println("your total is "+rolling_total); 
		
		
	}	

}

