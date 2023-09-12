
public class accessModifiers {
	private String testName; 

    protected int testAge; 
    
    //default
    String testAddress; 

    public void setname(String testName) {
        this.testName = testName;
    }

    public String getname() {
        return this.testName;
    }

    public void setage(int testAge) {
        this.testAge = testAge;
    }

    public int getage() {
        return this.testAge;
    }

    public void setaddress(String testAddress) {
        this.testAddress = testAddress;
    }

    public String getaddress() {
        return this.testAddress;
    }


    public static void main(String[] args) {
        accessModifiers Person = new accessModifiers();

        
        // System.out.println(person.testName); // this will give compile error

        
        Person.setname("Rajini");
        Person.setage(72);
        Person.setaddress("Poyas Garden");
        System.out.println(Person.getname());

        System.out.println(Person.testAge);
        System.out.println(Person.testAddress);
    }

}