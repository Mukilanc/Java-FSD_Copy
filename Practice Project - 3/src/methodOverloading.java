
public class methodOverloading {

	  // Static method
	  public static void printMessage() {
	    System.out.println("This is a static method");
	  }

	  // Predefined method
	  public void println(String message) {
	    System.out.println(message);
	  }

	  // User defined method
	  public void sum(int a, int b) {
	    int sum = a + b;
	    System.out.println("The sum of a and b is: " + sum);
	  }

	  // Method overloading
	  public void sum(int a, int b, int c) {
	    int sum = a + b + c;
	    System.out.println("The sum of a, b and c is: " + sum);
	  }

	  public static void main(String[] args) {
	    
	    methodOverloading.printMessage();

	    methodOverloading obj = new methodOverloading();
	    obj.println("This is a predefined method");

	    obj.sum(10, 20);

	    obj.sum(10, 20, 30);
	  }
}
