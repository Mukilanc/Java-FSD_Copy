
public class StringConversion {
	 public static void main(String[] args) {
		    String str = "This is a string";

		    StringBuffer sb = new StringBuffer(str);
		    System.out.println("StringBuffer: " + sb);

		    StringBuilder sb1 = new StringBuilder(str);
		    System.out.println("StringBuilder: " + sb1);
		  }
}
