package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {

	
	@Autowired //- byType - @Qualifier to resolve ambiguity
	@Qualifier("address1") //or @Qualifier(value="address1")
	private Address address;
	
	
	/* Resource-byName- no ambiguity, if not found then byType	
	@Resource // or @Resoure(name="address")
	@Qualifier(value="address2")
	Address address;
	 */
	
	/* Resource-byType - so ambiguity - @Qualifier to resolve ambiguity
	@Inject
	@Qualifier(value="address2") or @Qualifier("address1")
	Address address;
	*/

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
