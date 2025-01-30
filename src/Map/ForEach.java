// Java Program to Iterate over HashMap
// Iterating HashMap using forEach

// Importing Map and HashMap classes
// from package names java.util
package Map;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

	// Main driver method
	public static void main(String[] args) {
		// Creating hash map
		Map<Character, String> charType = new HashMap<Character, String>();

		// Inserting data in the hash map.
		charType.put('J', "Java");
		charType.put('H', "Hibernate");
		charType.put('P', "Python");
		charType.put('A', "Angular");

		// Iterating HashMap through forEach and
		// Printing all. elements in a Map
		charType.forEach((key, value) -> System.out.println(key + " = " + value));
	}
}
