package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Address address;
	
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
