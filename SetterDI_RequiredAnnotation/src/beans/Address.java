package beans;

import org.springframework.beans.factory.annotation.Required;

public class Address {

	private String blockNo;
	private String buildingName;
	
	@Required
	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	@Override
	public String toString() {
		return "Address [blockNo=" + blockNo + ", buildingName=" + buildingName + "]";
	}
	
}
