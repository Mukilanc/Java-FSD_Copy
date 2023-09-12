
public class OuterClass {
	private int data = 10;

	  class InnerClass {

	    public void printData() {
	      System.out.println("The data is: " + data);
	    }
	  }

	  public static void main(String[] args) {
	    OuterClass outerClass = new OuterClass();
	    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
	    innerClass.printData();
	  }
}
