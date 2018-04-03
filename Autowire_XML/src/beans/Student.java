package beans;

public class Student {

	
	Address address;

	public Student() {
		System.out.println("default constructor");	
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student(Address address) {
		this.address = address;
		System.out.println("parameterized constructor.. Address : "+address.toString());	
	}
	
	

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
