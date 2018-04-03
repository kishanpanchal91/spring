package beans;

public class Address {

	private String blockNo;
	private String blockName;
	
	public Address(String blockNo, String blockName) {
		this.blockName = blockName;
		this.blockNo = blockNo;
	}

	@Override
	public String toString() {
		return "Address [blockNo=" + blockNo + ", blockName=" + blockName + "]";
	}
	
	
}
