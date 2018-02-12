package full.oopsConcepts;

public class Aadhar {
	// Main method
	public static void main(String[] args) {
		System.out.println("	Government of India\n");
		System.out.println("Aadhar Details");
		System.out.println("--------------");

		// Encapsulation
		Person pObj = new Person();
		pObj.setName("Nisharth K");
		pObj.setDob("07 / 09 / 1995");
		pObj.setAddress("No.10, xxx, yyyy");
		System.out.print("Name		: " + pObj.getName());

		// Abstraction
		Id idObj = new Id();
		idObj.displayAadharID();

		// polymorphism
		// overriding
		PersonInfo bObj = new PersonInfo();
		bObj.displayPersonDetails();
		System.out.println(pObj.getDob());
		PersonMoreInfo dObj = new PersonMoreInfo();
		dObj.displayPersonDetails();
		System.out.println(pObj.getAddress());

		// overloading
		dObj.personGender();
		dObj.personGender("return type operator overloading");

	}
}
