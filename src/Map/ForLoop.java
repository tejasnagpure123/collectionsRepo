// Java Program to Iterate over HashMap

// Importing Map and HashMap classes
// from package names java.util
package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Class for iterating HashMap using for loop
public class ForLoop {

	// Main driver method
	public static void main(String[] args) {
		// Creating a HashMap
		Map<String, String> foodTable = new HashMap<String, String>();

		// Inserting elements to the adobe HashMap
		// Elements- Key value pairs using put() method
		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		// Iterating HashMap through for loop
		for (Entry<String, String> set : foodTable.entrySet()) {

			// Printing all elements of a Map
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}
