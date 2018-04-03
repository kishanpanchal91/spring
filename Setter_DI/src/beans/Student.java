package beans;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Student {
	 
	//=================================Primitives===========================
	// primitives
	private int rollNo;
	private String name;
	private int [] rollNosArray;
	
	//collection with primitives
	private List<Integer> rollNosList;
	private Set<String> books1;
	private Map<String,String> studentStandardMap;
	
	private Vector<String> rollNosVector;
	private TreeSet<String> books1TreeSet;
	private Hashtable<String,String> studentStandardHashTable;
	//=============================Objects==================================
	// Collection with objects
	
	private Address address;
	private Address [] addresses;

	private List<Address> addressList;
	private Set<Address> addressSet;
	private Map<String,Address> studentAddressMap;

	//=============================Properties=================================
	private Properties property;
	private Properties propertyFile;

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNosArray(int[] rollNosArray) {
		this.rollNosArray = rollNosArray;
	}

	public void setRollNosList(List<Integer> rollNosList) {
		this.rollNosList = rollNosList;
	}

	public void setBooks1(Set<String> books1) {
		this.books1 = books1;
	}

	public void setStudentStandardMap(Map<String, String> studentStandardMap) {
		this.studentStandardMap = studentStandardMap;
	}

	public void setRollNosVector(Vector<String> rollNosVector) {
		this.rollNosVector = rollNosVector;
	}

	public void setBooks1TreeSet(TreeSet<String> books1TreeSet) {
		this.books1TreeSet = books1TreeSet;
	}

	public void setStudentStandardHashTable(Hashtable<String, String> studentStandardHashTable) {
		this.studentStandardHashTable = studentStandardHashTable;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}

	public void setStudentAddressMap(Map<String, Address> studentAddressMap) {
		this.studentAddressMap = studentAddressMap;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public void setPropertyFile(Properties propertyFile) {
		this.propertyFile = propertyFile;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", rollnos=" + Arrays.toString(rollNosArray) + ", rollNos="
				+ rollNosList + ", books1=" + books1 + ", studentStandardMap=" + studentStandardMap + ", booksVector="
				+ rollNosVector + ", books1TreeSet=" + books1TreeSet + ", studentStandardHashTable="
				+ studentStandardHashTable + ", address=" + address + ", addresses=" + Arrays.toString(addresses)
				+ ", addressList=" + addressList + ", addressSet=" + addressSet + ", studentAddressMap="
				+ studentAddressMap + ", property=" + property + ", propertyFile=" + propertyFile + "]";
	}  
}
