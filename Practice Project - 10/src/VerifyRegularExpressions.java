import java.util.regex.*;

public class VerifyRegularExpressions {
	public static void main(String[] args) {

	    String regex = "\\d{10}";

	    Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher("1234567890");

	    boolean isMatch = matcher.matches();

	    System.out.println("Is the string '1234567890' a phone number? " + isMatch);
	  }
}
