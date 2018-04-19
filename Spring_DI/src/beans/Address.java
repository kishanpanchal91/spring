package beans;

public class Address {
	private String country;
	private String state;
	private String city;

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + "]";
	}

	
}
