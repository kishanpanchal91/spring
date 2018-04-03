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
	private int rollNo1;

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
	
	// passing all types
	public Student(int rollNo, String name, int[] rollNosArray, List<Integer> rollNosList, Set<String> books1, Map<String, String> studentStandardMap,
			Vector<String> rollNosVector, TreeSet<String> books1TreeSet, Hashtable<String, String> studentStandardHashTable, Address address,
			Address[] addresses, List<Address> addressList, Set<Address> addressSet, Map<String, Address> studentAddressMap, Properties property,
			Properties propertyFile) {
		this.rollNo = rollNo;
		this.name = name;
		this.rollNosArray = rollNosArray;
		this.rollNosList = rollNosList;
		this.books1 = books1;
		this.studentStandardMap = studentStandardMap;
		this.rollNosVector = rollNosVector;
		this.books1TreeSet = books1TreeSet;
		this.studentStandardHashTable = studentStandardHashTable;
		this.address = address;
		this.addresses = addresses;
		this.addressList = addressList;
		this.addressSet = addressSet;
		this.studentAddressMap = studentAddressMap;
		this.property = property;
		this.propertyFile = propertyFile;
		System.out.println("Constructor all types DI");
	}

	// testing ambiguity an resolving same using type
	public Student(int rollNo, String name,int rollNo1) {
		this.rollNo = rollNo;
		this.name = name;
		this.rollNo1 = rollNo;
		System.out.println("Constructor 2...");
	}
	public Student(String name, int rollNo, int rollNo1) {
		this.rollNo = rollNo;
		this.name = name;
		this.rollNo1 = rollNo1;
		System.out.println("Constructor 3...");
	}
		// Changing order by using index
		public Student(int rollNo, String name, Address address) {
			this.rollNo = rollNo;
			this.name = name;
			this.address=address;
			System.out.println("Constructor 4...");
		}
		public Student(String name, Address address, int rollNo) {
			this.rollNo = rollNo;
			this.name = name;
			this.address=address;
			System.out.println("Constructor 5...");

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
