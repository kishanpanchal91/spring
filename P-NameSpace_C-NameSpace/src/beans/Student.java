package beans;

public class Student {
private String enroll;
private String name;
private Address address;

public void setEnroll(String enroll) {
	this.enroll = enroll;
}

public void setName(String name) {
	this.name = name;
}
public void setAddress(Address address) {
	this.address = address;
}

public void printData(){
	System.out.println(" enroll "+enroll);
}
}
