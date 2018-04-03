package beans;

public class Address {

	private String blockNo;
	private String buildingName;
	
	
	
	public Address(String blockNo, String buildingName) {
		this.blockNo = blockNo;
		this.buildingName=buildingName;
	}
	
	@Override
	public String toString() {
		return "Address [blockNo=" + blockNo + ", buildingName=" + buildingName + "]";
	}
	
}
