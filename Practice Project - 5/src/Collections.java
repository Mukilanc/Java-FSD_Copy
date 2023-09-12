import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
	  public static void main(String[] args) {

		    ArrayList<String> arrayList = new ArrayList<>();
		    arrayList.add("Rajini");
		    arrayList.add("Ashok");
		    arrayList.add("Vijay");

		    System.out.println("The size of the ArrayList is: " + arrayList.size());

		    boolean isPresent = arrayList.contains("Rajini");
		    System.out.println("Is the element 'Rajini' in the ArrayList? " + isPresent);

		    arrayList.remove("Ashok");

		    System.out.println("The size of the ArrayList after removing an element is: " + arrayList.size());

		    for (String name : arrayList) {
		      System.out.println("The name is: " + name);
		    }

		    HashSet<String> hashSet = new HashSet<>();
		    hashSet.add("Rajini");
		    hashSet.add("Ashok");
		    hashSet.add("Vijay");

		    isPresent = hashSet.contains("Rajini");
		    System.out.println("Is the element 'Rajini' in the HashSet? " + isPresent);

		    hashSet.add("Rajini");

		    System.out.println("The size of the HashSet after adding an element is: " + hashSet.size());

		    for (String name : hashSet) {
		      System.out.println("The name is: " + name);
		    }
		  }
}
