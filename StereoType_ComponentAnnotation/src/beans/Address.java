package beans;

public class Address {

	int blockNo;
	String blockName;	
	
	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	@Override
	public String toString() {
		return "Address [blockNo=" + blockNo + ", blockName=" + blockName + "]";
	}
		
}
