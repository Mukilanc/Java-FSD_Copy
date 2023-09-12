import java.util.*;

public class maps {
	public static void main(String[] args) {
		  
	    HashMap<String, String> hashMap = new HashMap<>();
	    hashMap.put("key1", "value1");
	    hashMap.put("key2", "value2");

	    System.out.println("The size of the HashMap is: " + hashMap.size());

	    boolean isPresent = hashMap.containsKey("key1");
	    System.out.println("Is the key 'key1' in the HashMap? " + isPresent);

	    hashMap.remove("key2");

	    System.out.println("The size of the HashMap after removing an element is: " + hashMap.size());

	    for (String key : hashMap.keySet()) {
	      System.out.println("The key is: " + key + ", the value is: " + hashMap.get(key));
	    }


	    TreeMap<String, String> treeMap = new TreeMap<>();
	    treeMap.put("key1", "value1");
	    treeMap.put("key2", "value2");

	    isPresent = treeMap.containsKey("key1");
	    System.out.println("Is the key 'key1' in the TreeMap? " + isPresent);

	    treeMap.put("key2", "value2");

	    System.out.println("The size of the TreeMap after adding an element is: " + treeMap.size());

	    for (String key : treeMap.keySet()) {
	      System.out.println("The key is: " + key + ", the value is: " + treeMap.get(key));
	    }
	  }
}
