
public class typeCasting {
	
	public static void main(String[] args) {
	
	        
	        byte b = 10;
	        short s = b; 
	        int i = s; 
	        long l = i; 
	        float f = l; 
	        double d = f; 
	
	        System.out.println("b = " + b);
	        System.out.println("s = " + s);
	        System.out.println("i = " + i);
	        System.out.println("l = " + l);
	        System.out.println("f = " + f);
	        System.out.println("d = " + d);
	
	        
	        float f1 = 10.5f;
	        int i1 = (int) f1;
	
	        System.out.println("f1 = " + f1);
	        System.out.println("i1 = " + i1);
	    }
}
