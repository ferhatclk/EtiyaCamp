package kodlamaioDbWorkshop;

public class Customer {
	private int id;
	private String customerNo;
	private Channel channel;
	
	public Customer() {
		super();
	}

	public Customer(int id, String customerNo, Channel channel) {
		super();
		this.id = id;
		this.customerNo = customerNo;
		this.channel = channel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
}
