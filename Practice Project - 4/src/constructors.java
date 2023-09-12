
public class constructors {
	public constructors() {
	    System.out.println("Default constructor called");
	  }
	  
	  public constructors(String name) {
	    System.out.println("Parameterized constructor with one argument called");
	    this.name = name;
	  }

	  public constructors(String name, int age) {
	    System.out.println("Parameterized constructor with two arguments called");
	    this.name = name;
	    this.age = age;
	  }

	  private String name;
	  private int age;

	  public static void main(String[] args) {
	    constructors construct1 = new constructors();

	    constructors construct2 = new constructors("Rajini");

	    constructors construct3 = new constructors("Rajini", 23);

	    System.out.println("Name of constructors1: " + construct1.name);
	    System.out.println("Age of constructors1: " + construct1.age);

	    System.out.println("Name of constructors2: " + construct2.name);
	    System.out.println("Age of constructors2: " + construct2.age);

	    System.out.println("Name of constructors3: " + construct3.name);
	    System.out.println("Age of constructors3: " + construct3.age);
	  }
}
