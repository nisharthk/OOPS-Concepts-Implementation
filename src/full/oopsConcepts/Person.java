
//encapsulation

package full.oopsConcepts;

public class Person {
	private String name;
	private String dob;
	private String Address;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
