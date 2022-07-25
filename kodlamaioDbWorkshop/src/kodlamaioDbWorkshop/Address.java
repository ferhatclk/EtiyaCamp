package kodlamaioDbWorkshop;

public class Address {
	private int id;
	private Customer customer;
	private String city;
	private String addressDetail;
	
	public Address() {
		super();
	}

	public Address(int id, Customer customer, String city, String addressDetail) {
		super();
		this.id = id;
		this.customer = customer;
		this.city = city;
		this.addressDetail = addressDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	
}
