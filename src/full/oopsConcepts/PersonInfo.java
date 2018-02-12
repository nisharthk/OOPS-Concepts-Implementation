package full.oopsConcepts;

class PersonInfo {
	public void displayPersonDetails() {
		System.out.print("Date of Birth	: ");
	}
}

// Inheritance

class PersonMoreInfo extends PersonInfo {
	//runtime polymorphism
	@Override
	public void displayPersonDetails() {
		System.out.print("Address		: ");
	}

	//compile time polymorphism
	// Overloading
	public void personGender() {
		System.out.print("Sex		: ");
	}
	public String personGender(String s) {
		System.out.print("Male");
		return s;
	}
}


