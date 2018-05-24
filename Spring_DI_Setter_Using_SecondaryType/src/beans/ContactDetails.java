package beans;

public class ContactDetails {
private String contact;
public void setContact(String contact) {
	this.contact = contact;
}
public String getContact() {
	return contact;
}
@Override
public String toString() {
	return "Address [contact=" + contact + "]";
}


}
