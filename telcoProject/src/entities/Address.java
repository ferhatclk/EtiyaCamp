package entities;

public class Address {
	private int id;
	private String addressDescription;
	private AddressType addressTypeId;
	private Customer customer;
	
	
	public Address() {
		super();
	}
	
	
	public Address(int id, String addressDescription, AddressType addressTypeId, Customer customer) {
		super();
		this.id = id;
		this.addressDescription = addressDescription;
		this.addressTypeId = addressTypeId;
		this.customer = customer;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressDescription() {
		return addressDescription;
	}
	public void setAddressDescription(String addressDescription) {
		this.addressDescription = addressDescription;
	}
	public AddressType getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(AddressType addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
