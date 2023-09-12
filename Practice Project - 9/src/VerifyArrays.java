
public class VerifyArrays {
	public static void main(String[] args) {

	    int[] array = new int[10];
//Confirming length
	    assert len(array) == 10;
//confirming index 0 = 0
	    assert array[0] == 0;

	    array[5] = 10;
//assigning index 5 = 10
	    assert array[5] == 10;

	    printArray(array);
	  }

	  public static int len(int[] array) {
	    return array.length;
	  }

	  public static void printArray(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	      System.out.println(array[i]);
	    }
	  }
}
